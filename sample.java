class zoho{
    public static void main(String[] args) {

        public void Counting(){
            int count = 0;
            try {
                File file = new File("sample.java");
                Scanner sc = new Scanner(file);
                while(sc.hasNextLine()) {
                    sc.nextLine();
                    count++;
                }
                System.out.println("Total Number of Lines in sample.java file : " + count);
                sc.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
    }
}