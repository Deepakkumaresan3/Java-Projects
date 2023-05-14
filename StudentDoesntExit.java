class StudentDoesntExist extends Exception {
        private String message;

        public StudentDoesntExist(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return "StudentDoesntExist :"+ message;
        }
}
