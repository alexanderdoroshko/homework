package by.teachmeskills.myeshop.dao.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Category extends BaseEntity{
    private String name;
    private int rating;
    private String imagePath;

    private Category(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.rating = builder.rating;
        this.imagePath = builder.imagePath;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public static Builder categoryBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private int id;
        private String name;
        private int rating;
        private String imagePath;


        private Builder() {
        }

        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withRating(int rating) {
            this.rating = rating;
            return this;
        }

        public Builder withImagePath(String imagePath) {
            this.imagePath = imagePath;
            return this;
        }

        public Category buildFromResultSet(ResultSet resultSet) throws SQLException {
            this.withId(resultSet.getInt("id"))
                    .withName(resultSet.getString("name"))
                    .withRating(resultSet.getInt("rating"))
                    .withImagePath(resultSet.getString("imagePath"));


            return new Category(this);
        }

        public Category build() {
            return new Category(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return rating == category.rating && name.equals(category.name) && imagePath.equals(category.imagePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, imagePath);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }
}
