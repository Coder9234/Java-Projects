public class ShortestPath {
    public static float path(String path){
        // initializing origin
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++){
            char dir = path.charAt(i);
            // South
            if (dir == 'S'){
                y--;
            }
            // North
            else if (dir == 'N'){
                y++;
            }
            // East
            else if (dir == 'E'){
                x++;
            }
            // West
            else if (dir == 'W'){
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float)Math.sqrt(x2 + y2);
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(path(path));
    }
}
