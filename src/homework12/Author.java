package homework12;

import java.util.Objects;

public class Author {
    private String authorFirstName;
    private String authorSecondName;

    public Author(String authorFirstName, String authorSecondName) {
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;

    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public String getAuthorSecondName() {
        return this.authorSecondName;
    }


    @Override
    public String toString() {
        return "Имя " + authorFirstName + " Фамилия " + this.authorSecondName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a2 = (Author) other;
        return authorFirstName.equals(a2.authorFirstName) && authorSecondName.equals(a2.authorSecondName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorFirstName, authorSecondName);

    }
}
