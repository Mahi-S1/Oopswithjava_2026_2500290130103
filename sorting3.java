import java.util.*;
class Library{
    int id;
    String title;
    int pages;
    Library(int id,String title, int pages){
        this.id=id;
        this.title=title;
        this.pages=pages;
    }
    public String toString(){
        return this.id+" "+this.title+" "+this.pages;
    }
}
class LibraryComparator implements Comparator<Library>{
    public int compare(Library l1, Library l2){
        if(l1.pages != l2.pages){
            return l1.pages-l2.pages;
        }
        return l1.title.compareTo(l2.title);
    }
}
public class sorting3{
    public static void main(String[] args){
        List<Library> l = new ArrayList<>();
        l.add(new Library(101, "Java Basics",150));
        l.add(new Library(104, "Data Structures",150));
        l.add(new Library(103, "Computer Networks",250));
        l.add(new Library(102, "Operating Systems",400));
        l.sort(new LibraryComparator());
        System.out.println(l);
    }
}