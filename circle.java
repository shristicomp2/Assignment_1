 
public class circle
{
 double radius;
 double pi=3.14;
 
 void init(double r)
 {
  radius=r;
 }
  double calc()
 {
  double ans=radius*radius*pi;//calculating area
   return ans;
 }
 public static void main()
 {
   circle obj = new circle();
   obj.init(10.5);
   double area = obj.calc();
   System.out.println(area);
 }
}