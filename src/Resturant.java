public class Resturant {
    int tea;
    int coffee;
    int snacks;
    int idli;
    int dosa;
    String name;
    long phnno;
    public Resturant(String name,long phnno){
        this.name=name;
        this.phnno=phnno;


    }
    int tea(int count)
    {
        this.tea=this.tea*count;
        return this.tea;
    }
    int coffe(int count){
        this.coffee=this.coffee*count;
        return this.coffee;
    }
    int snacks(int count){
        this.snacks=this.snacks*count;
        return this.snacks;
    }
    int idli(int count){
        this.idli=this.idli*count;
        return this.snacks;
    }
    int dosa(int count){
        this.dosa=this.dosa*count;
        return this.dosa;
    }

}

