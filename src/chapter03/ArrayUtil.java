package chapter03;

public class ArrayUtil {
	public static double[] intToDouble(int[] source) {
		double[] dest = null;
		
		if (source != null) {
			int length = source.length;
			dest = new double[length];
			
			for (int i = 0; i < length; i++) {
				dest[i] = source[i];
			}
		}
		
		return dest;
	}
}
