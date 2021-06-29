package by.teachmeskills.myeshop.dao.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Product extends BaseEntity {
    private String name;
    private String description;
    private String imagePath;
    private int price;
    private int categoryId;

    private Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.imagePath = builder.imagePath;
        this.price = builder.price;
        this.categoryId = builder.categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public static Builder productBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private int id;
        private String name;
        private String description;
        private String imagePath;
        private int price;
        private int categoryId;


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

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withImagePath(String imagePath) {
            this.imagePath = imagePath;
            return this;
        }

        public Builder withPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder withCategoryId(int categoryId) {
            this.categoryId = categoryId;
            return this;
        }


        public Product buildFromResultSet(ResultSet resultSet) throws SQLException {
            this.withId(resultSet.getInt("id"))
                    .withName(resultSet.getString("name"))
                    .withDescription(resultSet.getString("description"))
                    .withImagePath(resultSet.getString("imagePath"))
                    .withPrice(resultSet.getInt("price"))
                    .withCategoryId(resultSet.getInt("categoryId"));


            return new Product(this);
        }

        public Product build() {
            return new Product(this);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Builder builder = (Builder) o;
        return id == builder.id && price == builder.price && categoryId == builder.categoryId && name.equals(builder.name) && description.equals(builder.description) && imagePath.equals(builder.imagePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, imagePath, price, categoryId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", price=" + price +
                ", categoryId=" + categoryId +
                '}';
    }
}



