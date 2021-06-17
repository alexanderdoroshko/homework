package by.teachmeskills.myeshop.command;

import by.teachmeskills.myeshop.PagesPathEnum;
import by.teachmeskills.myeshop.exceptions.CommandException;
import by.teachmeskills.myeshop.model.Product;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class CategoryRedirectCommandImpl implements BaseCommand {
    public List<Product> getProductMobile() {
        List<Product> products = new ArrayList<>();
        Product xiaomi = new Product(1, "Смартфон Xiaomi Mi 11 Lite 6GB/128GB международная версия с NFC",
                "Android, экран 6.55\" AMOLED (1080x2400), Qualcomm Snapdragon 732G, ОЗУ 6 ГБ, флэш-память 128 ГБ, карты памяти, камера 64 Мп, аккумулятор 4250 мАч, 2 SIM",
                939, "Xiaomi Mi 11 lite .jpeg");

        Product samsung = new Product(2, "Samsung Galaxy M31 SM-M315F",
                "Android, экран 6.4\" AMOLED (1080x2340), Exynos 9611, ОЗУ 6 ГБ, флэш-память 128 ГБ, карты памяти, камера 64 Мп, аккумулятор 6000 мАч, 2 SIM",
                690, "Samsung Galaxy M31 SM-M315F.jpeg");

        Product apple = new Product(3, "Apple iPhone XR 64GB",
                "Apple iOS, экран 6.1\" IPS (828x1792), Apple A12 Bionic, ОЗУ 3 ГБ, флэш-память 64 ГБ, камера 12 Мп, аккумулятор 2942 мАч, 1 SIM",
                1470, "Apple iPhone XR 64GB.jpeg");

        products.add(xiaomi);
        products.add(samsung);
        products.add(apple);
        return products;
    }

    public List<Product> getProductLaptop() {
        List<Product> products = new ArrayList<>();
        Product huawei = new Product(4, "Ноутбук Huawei MateBook D 14 AMD NblL-WDQ9",
                "14.0\" 1920 x 1080 IPS, 60 Гц, несенсорный, AMD Ryzen 5 4500U 2300 МГц, 8 ГБ, SSD 512 ГБ, видеокарта встроенная, Windows 10, цвет крышки серый",
                2699, "huaweiNote.jpeg");

        Product lenovo = new Product(5, "Ноутбук Lenovo IdeaPad S145-15API 81UT00MLRE",
                "15.6\" 1920 x 1080 TN+Film, 60 Гц, несенсорный, AMD 3020e 1200 МГц, 4 ГБ, SSD 256 ГБ, видеокарта встроенная, без ОС, цвет крышки серый",
                897, "lenovoNote.jpeg");

        Product asus = new Product(6, "Ноутбук ASUS VivoBook 15 X512DA-BQ1134",
                "15.6\" 1920 x 1080 IPS, 60 Гц, несенсорный, AMD Ryzen 5 3500U 2100 МГц, 8 ГБ, SSD 512 ГБ, видеокарта встроенная, Linux, цвет крышки серый",
                1579, "asusNote.jpeg");

        products.add(huawei);
        products.add(lenovo);
        products.add(asus);
        return products;
    }

    public List<Product> getProductFridges() {
        List<Product> products = new ArrayList<>();
        Product indesit = new Product(7, "Холодильник Indesit ITS 4200 W",
                "полный No Frost, механическое управление, класс A, полезный объём: 325 л (247 + 78 л), 60x64x196 см, белый",
                849, "indesitFridge.jpeg");

        Product atlant = new Product(8, "Холодильник ATLANT ХМ 4621-141",
                "без No Frost, электронное управление, класс A+, полезный объём: 324 л (205 + 119 л), зона свежести, 59.5x62.9x186.8 см, нержавеющая сталь",
                968, "atlantFridge.jpeg");

        Product lg = new Product(9, "Холодильник LG GA-B419SLGL",
                "полный No Frost, электронное управление, класс A+, полезный объём: 302 л (223 + 79 л), инверторный компрессор, 59.5x64.3x190.7 см, графит",
                1200, "LgFriedge.jpeg");

        products.add(indesit);
        products.add(atlant);
        products.add(lg);
        return products;
    }

    public List<Product> getProductCamera() {
        List<Product> products = new ArrayList<>();
        Product sony = new Product(10, "Беззеркальный фотоаппарат Sony Alpha a7 III Body",
                "беззеркальная камера, матрица Full frame (полный кадр) 24.2 Мп, без объектива (body), Wi-Fi",
                4700, "sonyCamera.jpeg");

        Product canon = new Product(11, "Зеркальный фотоаппарат Canon EOS 6D Body",
                "зеркальная камера, матрица Full frame (полный кадр) 20.2 Мп, без объектива (body), Wi-Fi",
                3399, "CanonCamera.jpg");

        Product nikon = new Product(12, "Зеркальный фотоаппарат Nikon D3500 Kit 18-55mm VR",
                "зеркальная камера, матрица APS-C (1.5 crop) 24.2 Мп, с объективом F3.5-5.6 18-55 мм",
                1320, "NikonCamera.jpeg");

        products.add(sony);
        products.add(canon);
        products.add(nikon);
        return products;
    }

    public List<Product> getProductGps() {
        List<Product> products = new ArrayList<>();
        Product navitel = new Product(13, "GPS навигатор NAVITEL T737 PRO",
                "экран 7\" IPS (1024 x 600), процессор MediaTek MT8321 1300 МГц, ОЗУ 1 Гб, флэш-память 16 ГБ, 3G, камера 2 Мп, Android 9.0 Pie",
                276, "navitelGPS.jpeg");

        Product garmin = new Product(14, "GPS навигатор Garmin Drive 52 MT",
                "экран 5\" TFT (480 x 272)",
                547, "garminGps.jpeg");

        Product geofox = new Product(15, "GPS навигатор GEOFOX MID 702 ХЕ",
                "экран 7\" TFT (800 x 480), процессор MStar MSB2531 800 МГц, ОЗУ 256 Мб, флэш-память 8 Гб, Windows CE 6.0",
                220, "geofoxGPS.jpeg");

        products.add(navitel);
        products.add(garmin);
        products.add(geofox);
        return products;
    }

    public List<Product> getProductCar() {
        List<Product> products = new ArrayList<>();
        Product lexus = new Product(16, "Lexus NX",
                "2018 г., автомат, 2.0 л, бензин, 50 000 км",
                86320, "LexusCar.jpeg");

        Product infinity = new Product(17, "Infiniti Q30",
                "2017 г., механика, 1.5 л, дизель, 47 000 км",
                46200, "infinityCar.jpeg");

        Product renault = new Product(18, "Renault Megane III",
                "2010 г., механика, 1.5 л, дизель, 224 000 км",
                17400, "renaultCarjpeg.jpeg");

        products.add(lexus);
        products.add(infinity);
        products.add(renault);
        return products;
    }


    @Override
    public String execute(HttpServletRequest request) throws CommandException {
        String categoryType = request.getParameter("categoryType");

        switch (categoryType) {
            case ("Mobile phones"): {
                List<Product> products = getProductMobile();
                request.setAttribute("products", products);
                break;
            }
            case ("Laptop"): {
                List<Product> products = getProductLaptop();
                request.setAttribute("products", products);
                break;
            }
            case ("Fridges"): {
                List<Product> products = getProductFridges();
                request.setAttribute("products", products);
                break;
            }
            case ("Cameras"): {
                List<Product> products = getProductCamera();
                request.setAttribute("products", products);
                break;
            }
            case ("GPS navigators"): {
                List<Product> products = getProductGps();
                request.setAttribute("products", products);
                break;
            }
            case ("Car"): {
                List<Product> products = getProductCar();
                request.setAttribute("products", products);
                break;
            }
        }
        return PagesPathEnum.CATEGORY_PAGE.getPath();

    }
}
