package ru.itsjava.hw.lists.linkedlist;

import java.util.List;

public class MyLinkedList {
    private Node head;


    public int size() {
        int count = 0;
        if (head == null) {
            return count;
        } else {
            count = 1;
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
                count++;
            }
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(Object o) {
        if (head == null) {
            return false;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                if (o.equals(head.getValue())) {
                    return true;

                } else {
                    curNode = curNode.getNext();
                }
            }
        }
        return true;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        return true;
    }

    public boolean remove(Object o) {
        if (head == null) return false; //проверка на null (если список пуст, то удалять не надо)

        if (head.getValue().equals(o)) { // если есть совпадение, то присвоить хэду ссылку на след.элемент(сместить дальше)
            head = head.getNext();
            return true;
        }
        if (head.getNext() == null) { // проверка, есть ли след.элемент после хэда. если бы эл-т был в списке, то уже нашли и удалили
            return false;
        }

        Node curNode = head; // текущему эл-ту присвоим хэд
        Node prevNode = head; // предыдущему присвоим хэд

        while ((curNode = curNode.getNext()) != null) { // бежим до тех пор пока не упремся в налл.
            if (curNode.getValue().equals(o)) { // если есть совпадение, заканчиваем бежать
                break;
            }
            prevNode = prevNode.getNext(); //иначе передвигаем и предыдущую точку
        }
        if (curNode == null) return false; // проверка на налл, если мы добежали до конца списка

        prevNode.setNext(curNode.getNext());//перенаправили ссылку с преда на элемент идущий после удаляемого
        curNode.setNext(null); //обнуляем ссылку удаляемого
        return true;
    }

    public void clear() {
        head = null;
    }

    public Object get(int index) {
        checkIndex(index);
        if (index == 0) {
            return head;
        } else {
            int count = 0;
            Node curNode = head;
            while ((curNode = curNode.getNext()) != null) {
                count++;
                if (count == index) {
                    return curNode;
                }
            }
        }
        return null;
    }

    public void set(int index, Object element) {
        checkIndex(index);
        if (index == 0) {
            head.setValue(element);
        } else {
            int count = 0;
            Node curNode = head;
            while ((curNode = curNode.getNext()) != null) {
                count++;
                if (count == index) {
                    curNode.setValue(element);
                }
            }
        }
    }


    // СТРОКА1 -> СТРОКА2 -> СТРОКА3 -> null
    // СТРОКА1 ->  null

    public Object remove(int index) {
        checkIndex(index);
        if (index == 0) {
            Object resValue = head.getValue();
            if (head.getNext() == null) {
                head = null;
            } else {
                head = head.getNext();
            }
            return resValue;
        }
        Node curNode = head;
        Node prevNode = head;
        int count = 0;
        while ((curNode = curNode.getNext()) != null) {
            count++;
            if (count == index) {
                break;
            }
            prevNode = prevNode.getNext();
        }

        Object resValue = curNode.getValue();

        if (curNode.getNext() == null) {
            prevNode.setNext(null);
        } else {
            prevNode.setNext(curNode.getNext());
            curNode.setNext(null);
        }

        return resValue;
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < size())) {
            return true;
        }
        return false;
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

//    public int indexOf(Object o) {
//        int index = 0;
//        Node current = head;
//        while (current != null) {
//            if (current.equals(o)) {
//                return index;
//            }
//            index++;
//            current = current.getNext();
//        }
//        if (index == size() && o == null) {
//            return -1;
//        } else {
//            return index;
//        }
//
//    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
