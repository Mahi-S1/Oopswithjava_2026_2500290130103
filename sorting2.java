import java.util.*;
class Product{
    
    int id;
    String name;
    int price;
    Product(int id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public String toString(){
        return this.name+" "+this.price;
    }
}
class ProductComparator implements Comparator<Product>{
    public int compare(Product p1,Product p2){
        if(p1.price != p2.price){
            return p2.price-p1.price; 
        }
        return p1.name.compareTo(p2.name);

    }
}
public class sorting2{
    public static void main(String[] args) {
        List<Product> l = new ArrayList<>();
        l.add(new Product(1,"A",100));
        l.add(new Product(2,"B",200));
        l.add(new Product(3,"C",300));
        l.add(new Product(4,"D",400));
        l.sort(new ProductComparator());
        System.out.println(l);
    }
}
