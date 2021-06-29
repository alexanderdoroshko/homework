package by.teachmeskills.myeshop.dao.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Order extends BaseEntity {
    private String date;
    private int price;
    private int userId;

    private Order(Builder builder) {
        this.id = builder.id;
        this.date = builder.date;
        this.price = builder.price;
        this.userId = builder.userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public static Builder orderBuilder() {
        return new Builder();
    }


    public static final class Builder {
        private int id;
        private String date;
        private int price;
        private int userId;


        private Builder() {
        }

        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withDate(String date) {
            this.date = date;
            return this;
        }

        public Builder withPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder withUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public Order buildFromResultSet(ResultSet resultSet) throws SQLException {
            this.withId(resultSet.getInt("id"))
                    .withDate(resultSet.getString("date"))
                    .withPrice(resultSet.getInt("price"))
                    .withUserId(resultSet.getInt("user_id"));


            return new Order(this);
        }

        public Order build() {
            return new Order(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return price == order.price && userId == order.userId && date.equals(order.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, price, userId);
    }

    @Override
    public String toString() {
        return "Order{" +
                "date='" + date + '\'' +
                ", price=" + price +
                ", userId=" + userId +
                '}';
    }
}
