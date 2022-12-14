package ThirdAttempt;

public class House implements Comparable<House>{
    private int area;
    private int price;
    private String city;
    private boolean hasFurniture;

    public House (int area, int price, String city, boolean hasFurniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }
    public String toString(){ // 1 вариант
        final StringBuffer sb = new StringBuffer("House {");
            sb.append("area = ").append(area);
            sb.append(", price = ").append(price);
            sb.append(", city = ").append(city);
            sb.append(", hasFurniture = ").append(hasFurniture);
            sb.append("}");
        return sb.toString();
    }

    @Override
    public int compareTo(House o) {
        if (this.area == o.area) {
            return 0;
        } else if (this.area < o.area) {
            return -1;
        } else {
            return 1;
        }
    }
//    public String toString(){ // 2 вариант
//        return "House{area ="+area+", price="+price+", city="+city+", hasFurniture"+hasFurniture+"}";
//    }
}
