package by.teachmeskills.myeshop;

import by.teachmeskills.myeshop.dao.domain.Category;
import by.teachmeskills.myeshop.dao.domain.Order;
import by.teachmeskills.myeshop.dao.domain.Product;
import by.teachmeskills.myeshop.dao.domain.User;
import by.teachmeskills.myeshop.exceptions.ServiceException;
import by.teachmeskills.myeshop.service.CategoryService;
import by.teachmeskills.myeshop.service.OrderService;
import by.teachmeskills.myeshop.service.UserService;
import by.teachmeskills.myeshop.service.impl.CategoryServiceImpl;
import by.teachmeskills.myeshop.service.impl.OrderServiceImpl;
import by.teachmeskills.myeshop.service.impl.UserServiceImpl;
import by.teachmeskills.myeshop.utils.CategoryGenerator;

import java.util.List;

public class Application {

    public static void main(String[] args) throws ServiceException {
//        UserService userService = new UserServiceImpl();
//
//        User user = User.userBuilder()
//                .withName("User2")
//                .withSurname("User2")
//                .withEmail("user2@mail.ru")
//                .withPassword("somepass35")
//                .withDateOfBirthday("09.06.1990")
//                .withBalance(100)
//                .build();
//
//        userService.create(user);
//
//        System.out.println(user.getName() + " is saved to DB");
//        CategoryService categoryService = new CategoryServiceImpl();
//
//        Category mobile = Category.categoryBuilder().withName("mobile").withRating(2).withImagePath("mobile.jpg").build();
//
//        categoryService.create(mobile);
//        System.out.println(mobile.getName() + " is save");


        OrderService orderService = new OrderServiceImpl();

        Order order1 = Order.orderBuilder().withDate("12.03.45").withPrice(400).withUserId(34).build();

        orderService.create(order1);





        System.out.println(order1.getPrice() + " is save");


    }
}
