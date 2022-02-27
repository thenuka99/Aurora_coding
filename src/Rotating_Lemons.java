import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Rotating_Lemons {
    public final static int R = 3;
    public final static int C = 5;

    static class Ele
    {
        int x = 0;
        int y = 0;
        Ele(int x,int y)
        {
            this.x = x;
            this.y = y;
        }
    }

    static boolean isValid(int i, int j)
    {
        return (i >= 0 && j >= 0 && i < R && j < C);
    }
    static boolean isDelim(Ele temp)
    {
        return (temp.x == -1 && temp.y == -1);
    }
    static boolean checkAll(int arr[][])
    {
        for (int i=0; i<R; i++)
            for (int j=0; j<C; j++)
                if (arr[i][j] == 1)
                    return true;
        return false;
    }

    public static void main(String[] args)
    {int row, col;
        int arr[][] = new int[500][500];
        Scanner sc = new Scanner(System.in);

        row = sc.nextInt();
        col = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Queue<Ele> Q=new LinkedList<>();
        Ele temp;
        int ans = 0;
        for (int i=0; i < R; i++)
            for (int j=0; j < C; j++)
                if (arr[i][j] == 2)
                    Q.add(new Ele(i,j));
        Q.add(new Ele(-1,-1));
        while(!Q.isEmpty())
        {
            boolean flag = false;
            while(!isDelim(Q.peek()))
            {
                temp = Q.peek();
                if(isValid(temp.x+1, temp.y) && arr[temp.x+1][temp.y] == 1)
                {
                    if(!flag)
                    {
                        ans++;
                        flag = true;
                    }
                    arr[temp.x+1][temp.y] = 2;
                    temp.x++;
                    Q.add(new Ele(temp.x,temp.y));
                    temp.x--;
                }
                if (isValid(temp.x-1, temp.y) && arr[temp.x-1][temp.y] == 1)
                {
                    if (!flag)
                    {
                        ans++;
                        flag = true;
                    }
                    arr[temp.x-1][temp.y] = 2;
                    temp.x--;
                    Q.add(new Ele(temp.x,temp.y));
                    temp.x++;
                }
                if (isValid(temp.x, temp.y+1) && arr[temp.x][temp.y+1] == 1) {
                    if(!flag)
                    {
                        ans++;
                        flag = true;
                    }
                    arr[temp.x][temp.y+1] = 2;
                    temp.y++;
                    Q.add(new Ele(temp.x,temp.y));
                    temp.y--;
                }
                if (isValid(temp.x, temp.y-1) && arr[temp.x][temp.y-1] == 1)
                {
                    if (!flag)
                    {
                        ans++;
                        flag = true;
                    }
                    arr[temp.x][temp.y-1] = 2;
                    temp.y--;
                    Q.add(new Ele(temp.x,temp.y));
                }
                Q.remove();
            }
            Q.remove();
            if (!Q.isEmpty())
            {
                Q.add(new Ele(-1,-1));
            }
        }
        if (checkAll(arr)) {
            System.out.println("-1");
        }else{
            System.out.println(ans);
        }
    }
}
