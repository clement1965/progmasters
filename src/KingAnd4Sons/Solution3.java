import java.io.*;
import java.util.*;

public class Solution3 {
  private static InputReader in;
  private static PrintWriter out;
  public static long mod = 1000000007;
  public static long INV4 = pow(new Complex(4,0), mod-2).a;
  
  static class Complex {
    public long a,b;
    public Complex(long a, long b) {
      this.a = a;
      this.b = b;
      if (a < 0) a += mod;
     
    }
    
    public Complex multiply(Complex other) {
      return new Complex((a * other.a + mod - (b * other.b % mod)) % mod, (a * other.b + b * other.a) % mod);
    }
  }
  
  public static Complex pow(Complex a, long e) {
    Complex r = new Complex(1,0);
    while(e>0) {
      if ((e&1)==1) r = r.multiply(a);
      a = a.multiply(a);
      e >>= 1;
    }
    return r;
  }
  
  public static long nways(long x) {
    Complex s1 = pow(new Complex(1, 1), x);
    Complex s2 = pow(new Complex(1, mod - 1), x);
    Complex s3 = pow(new Complex(2, 0), x);
    System.out.println("S3.a: "+s3.a+" S1.a: "+s1.a+" S2.a: "+s2.a);
    long res = (s3.a + s1.a + s2.a) % mod;
    System.out.println(res);
    System.out.println("INV4: "+INV4);
    System.out.println(new Complex(4, 0).a);
    return res * INV4 % mod;
  }

  public static void main(String[] args) throws IOException {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out, true);

    int numberOfBateiolns = in.nextInt();
    int NumberOfCountries = in.nextInt();
    long[] CountryTomb = new long[NumberOfCountries+1];
    CountryTomb[0] = 1;
    for (int i = 0; i < numberOfBateiolns; i++) {
      long mArmyLehetosegek = nways(in.nextInt());
      System.out.println("Lehetőseheg:"+mArmyLehetosegek);
      long[] next = new long[NumberOfCountries+1];
      System.arraycopy(CountryTomb, 0, next, 0, NumberOfCountries+1);
      for (int j = 0; j < NumberOfCountries; j++) {
        next[j+1] = (next[j+1] + CountryTomb[j] * mArmyLehetosegek) % mod;
      }
      CountryTomb = next;
    }
    out.println(CountryTomb[NumberOfCountries]);
    out.close();
    System.exit(0);
  }

  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }
  }


}
