void main(){
    Cookie cookie = new Cookie(5,"Arya Bakery", "Chocolate");
    cookie.getDetails();
}

class Cookie{
    String name;
    int radius;
    String flavour;
    Cookie(int radius, String name, String flavour){
        this.radius = radius;
        this.name = name;
        this.flavour = flavour;
    }
    void getDetails(){
            System.out.println(STR."Cake : \{name}, Radius : \{radius}, flavour : \{flavour}");
        }
}