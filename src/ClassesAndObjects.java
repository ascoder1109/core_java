void main(){
    Cookie cookie = new Cookie();
    cookie.baking();
    cookie.getDetails();
}
    class Cookie{
        String name = "Arya Bakery";
        int radius = 4;
        String flavour = "Chocolate";
        void baking(){
            System.out.println("Baking has started!");
        }
        void getDetails(){
            System.out.println(STR."Cake : \{name}, Radius : \{radius}, flavour : \{flavour}");
        }
    }