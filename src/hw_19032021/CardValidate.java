package hw_19032021;

public class CardValidate {
    public void ValidateCard(long numberCard, String typeCard, String ownerCard, int validThru, int CVV) {
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
                this.cvv = CVV;
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

            public int getValidthru() {
                return validthru;
            }

            public int getCvv() {
                return cvv;
            }

            public void ValidateNumberCard() {                  // Код банковской карты содержит 16 цифр
                int numeral = (int) Math.log10(getNumber()) + 1;
                if (numeral == 16) {
                    System.out.println("Количество цифр верно");
                } else {
                    System.out.println("Количетво цифр не верно, должно быть 16");
                }
            }

            public void ValidateDate() {
                if (2021 - getValidthru() < 4) {                  //Срок действия карты предположим 3 года
                    System.out.println("Карта действительна");
                } else {
                    System.out.println("Срок действия карты истек");
                }
            }

            public void ValidateCVV() {
                int numeral = (int) Math.log10(getCvv()) + 1;
                if (numeral == 3) {
                    System.out.println("СVV верен");
                } else {
                    System.out.println("СVV должен содержать 3 цифры");
                }
            }

            public void ValidateType() {   //Здесь сравниваем строки, credit card, overdraft
                String type = getType();
                if (type == "zarplatnaya") {
                    System.out.println("Тип верен");
                } else {
                    System.out.println("Тип не верен, необходим другой тип карты");
                }
            }

            public void ValidateOwner() {     //В отсутствии владельца ввести пустую строку
                if (getOwner() == "") {
                    System.out.println("Владелец отсутствует");
                } else {
                    System.out.println("Владелец имеется");
                }
            }
        }
        CardBank alfa = new CardBank();
        alfa.ValidateNumberCard();
        alfa.ValidateDate();
        alfa.ValidateCVV();
        alfa.ValidateType();
        alfa.ValidateOwner();

    }
}
