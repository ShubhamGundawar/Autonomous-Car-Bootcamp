import java.util.Scanner;

public class auto_car {

    double car_capacity = 200;
    double urban_gdist = 20;
    double rural_gdist = 50;
    //double road_length = 900;
    double rangelimit_urban = 0.25;
    double car_cu = car_capacity - (car_capacity * rangelimit_urban);//150
    double speed = 70;
    double u_speed= speed-(speed*0.25);//52.5
    double r_speed= speed+(speed*0.15);//80.5
    double g_u_time = (urban_gdist / speed)*60;//0.286*60=17.14
    double g_r_time = (rural_gdist / speed)*60;//0.714=42.86

    int refule_count =0;
    double total_dist = 0;
    double total_time = 0;


    public void refuleing() {
        refule_count++;
        total_time = total_time + 30;
        car_cu=145;
        System.out.println("refuled");
    }

    public void reach_citygarage() {
        car_cu= car_cu - urban_gdist;
        total_dist = total_dist + urban_gdist;
        total_time = total_time + g_u_time;
        System.out.println("reached");
    }

    public void road(double road_length){
        double dist=0;
        while(road_length>0){
            System.out.println("in");
            while(car_cu>5 && road_length>0){
                dist++;
                road_length--;
                car_cu--;
            }
            if(car_cu==5){
                refuleing();
                dist=dist+10;
            }
        }
        if(car_cu>=5 && car_cu<20){
            refuleing();
            dist=dist+10;
        }

        double time = (dist/u_speed)*60;
        total_dist=total_dist+dist;
        total_time=total_time+time;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an road length: ");
        double road_length = sc.nextDouble();
        //System.out.println("Enter road type: ");
        //String road_type = sc.next();
        auto_car obj = new auto_car();
        
        obj.reach_citygarage();
        obj.road(road_length);
        obj.reach_citygarage();
        System.out.println("time: "+ obj.total_time);
        System.out.println("dist: "+ obj.total_dist);
        System.out.println("refule: "+ obj.refule_count);

    }

}
