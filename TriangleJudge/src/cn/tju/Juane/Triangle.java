package cn.tju.Juane;

public class Triangle {
/**
 * judge the kind of triangle
 * @param edge1
 * @param edge2
 * @param edge3
 * @return the kind of Triangle
 * 0 for the triangle is equilateral
 * 1 for the triangle is isosceles
 * 2 for the triangle is scalene
 */
	public static int judgeKindOfTriangle(int edge1, int edge2, int edge3) {
		int kindOfTriangle = -1;//ֵ
		if(isTriangle(edge1, edge2, edge3)) {
			if((edge1 == edge2)&&( edge2 == edge3)) {
				kindOfTriangle = 0;
			}else if( (edge1 == edge2) ||(edge1 == edge3)) {
				kindOfTriangle = 1;
			}else if (edge3 == edge2) {
				kindOfTriangle = 1;
			}else {
				kindOfTriangle = 2;
			}	
		}
		
		return kindOfTriangle;
	}
	public static boolean isTriangle(int edge1, int edge2, int edge3) {
		boolean triangle = true;
		if((edge1 + edge2) <= edge3) {
			triangle = false;
		}else if((edge1 + edge3) <= edge2) {
			triangle = false;
		}else if((edge2 + edge3) <= edge1) {
			triangle = false;
		}
		return triangle;
	}
}
