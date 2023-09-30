package observer;

public enum VacancyType {

    PRODUCTMANAGER {
        @Override
        public String toString() {
            return "Product Manager";
        }
    },
    WEBDEVELOPER {
        @Override
        public String toString() {
            return "Web Developer";
        }
    };
}
