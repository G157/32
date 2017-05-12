package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {
	public  static void main (String args[]){
	SnakeCamelUtil scu = new SnakeCamelUtil();
	
	String snake = scu.snakeToCamelcase("snake_string");//キャメルへ
	System.out.println(snake);
	String camel = scu.camelToSnakecase("camelString");//スネークへ
	System.out.println(camel);
	String a2 = scu.capitalize("a");//複数文字じゃないとダメ
	String a1 = scu.capitalize(" ");
	String a3 = scu.capitalize("xyz");
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	String b1 = scu.uncapitalize(" ");
	String b2 = scu.uncapitalize("A");
	String b3 = scu.uncapitalize("Xyz");
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	String c1 = scu.snakeToCamelcase("abc");
	String c2 = scu.snakeToCamelcase("abc_def");
	String c3 = scu.snakeToCamelcase("abc_def_gh");
	String c4 = scu.snakeToCamelcase("abc__def___gh");
	String c5 = scu.snakeToCamelcase("_abc_def__");
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	String d1 = scu.camelToSnakecase("Abc");
	String d2 = scu.camelToSnakecase("AbcDef");
	String d3 = scu.camelToSnakecase("AbcDefGh");
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(d3);
	
	
	
	
	
	
	}
}
