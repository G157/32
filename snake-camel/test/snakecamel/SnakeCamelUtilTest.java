package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {
	public  static void main (String args[]){
	SnakeCamelUtil scu = new SnakeCamelUtil();
	
	String snake = scu.snakeToCamelcase("snake_string");
	System.out.println(snake);
	String camel = scu.camelToSnakecase("camelString");
	System.out.println(camel);
	}
}
