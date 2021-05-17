package ru.itsjava.hw.lists;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Book  {
    private final String naming;
    private final String author;


    public String getNaming() {
        return this.naming;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Book)) return false;
        final Book other = (Book) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$naming = this.getNaming();
        final Object other$naming = other.getNaming();
        if (this$naming == null ? other$naming != null : !this$naming.equals(other$naming)) return false;
        final Object this$author = this.getAuthor();
        final Object other$author = other.getAuthor();
        if (this$author == null ? other$author != null : !this$author.equals(other$author)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Book;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $naming = this.getNaming();
        result = result * PRIME + ($naming == null ? 43 : $naming.hashCode());
        final Object $author = this.getAuthor();
        result = result * PRIME + ($author == null ? 43 : $author.hashCode());
        return result;
    }

    public String toString() {

        return " Book{" + this.getNaming() + ", " + this.getAuthor() + "} ;";
    }
}

// [ Book{"7 навыков высокоэффективных людей", "Кови", 387};
//         Book{"Java. Эффективное программирование", "Блох Дж.", 219};]