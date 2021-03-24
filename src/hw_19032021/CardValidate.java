package hw_19032021;

public class CardValidate {
    public void validateCard(long numberCard, String typeCard, String ownerCard, int validThru, int cvv) {
        class CardBank {
            private long number;
            private String type;
            private String owner;
            private int validthru;
            private int cvv;

            public CardBank() {
                this.number = numberCard;
                this.type = typeCard;
                this.owner = ownerCard;
                this.validthru = validThru;
                this.cvv = cvv;
            }

            public long getNumber() {
                return number;
            }

            public String getType() {
                return type;
            }

            public String getOwner() {
                return owner;
            }

            public int getValidThru() {
                return validThru;
            }

            public int getCvv() {
                return cvv;
            }

            public void validateNumberCard() {                  // Код банковской карты содержит 16 цифр
                int numeral = (int) Math.log10(getNumber()) + 1;
                if (numeral == 16) {
                    System.out.println("Количество цифр верно");
                } else {
                    System.out.println("Количетво цифр не верно, должно быть 16");
                }
            }

            public void validateDate() {
                if (2021 - getValidThru() < 4) {                  //Срок действия карты предположим 3 года
                    System.out.println("Карта действительна");
                } else {
                    System.out.println("Срок действия карты истек");
                }
            }

            public void validateCVV() {
                int numeral = (int) Math.log10(getCvv()) + 1;
                if (numeral == 3) {
                    System.out.println("СVV верен");
                } else {
                    System.out.println("СVV должен содержать 3 цифры");
                }
            }

            public void validateType() {   //Здесь сравниваем строки, credit card, overdraft
                String type = getType();
                if (type == "zarplatnaya") {
                    System.out.println("Тип верен");
                } else {
                    System.out.println("Тип не верен, необходим другой тип карты");
                }
            }

            public void validateOwner() {     //В отсутствии владельца ввести пустую строку
                if (getOwner() == "") {
                    System.out.println("Владелец отсутствует");
                } else {
                    System.out.println("Владелец имеется");
                }
            }
        }
        CardBank alfa = new CardBank();
        alfa.validateNumberCard();
        alfa.validateDate();
        alfa.validateCVV();
        alfa.validateType();
        alfa.validateOwner();

    }
}
