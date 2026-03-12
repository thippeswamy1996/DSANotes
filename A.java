import java.util.*;
public class A{
public static void main(String [] args){
List<List<Integer>> list = Arrays.asList(
  Arrays.asList(3, 4, 5),
  Arrays.asList(6, 7, 8),
  Arrays.asList(1, 2, 9)
);
Collections.reverse(list);
System.out.println(list);
}}

