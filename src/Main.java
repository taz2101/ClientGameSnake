import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.net.Socket;
import java.security.Key;

public class Main extends JFrame {
    static Socket s ;

    static String data;
    static BufferedReader br;

    static BufferedWriter w;
    public Main(){
        setSize(500,500);
        //tat se khong chay ngam
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(new handler());
        setVisible(true);

    }
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");
        s= new Socket("127.0.0.1",12345);;
        data = "";
        Main f = new Main();
        while (data.compareTo("stop")!= 0){
            /*br = new BufferedReader( new InputStreamReader((System.in)));
            data = br.readLine();
            w = new BufferedWriter(new OutputStreamWriter((s.getOutputStream())));
            w.write(data+"\n");
            w.flush();*/
        }



    }
    private class handler implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_UP) {
                br = new BufferedReader( new InputStreamReader((System.in)));
                data = "up";
                try {
                    w = new BufferedWriter(new OutputStreamWriter((s.getOutputStream())));
                    w.write(data+"\n");
                    w.flush();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
            if(e.getKeyCode() == KeyEvent.VK_DOWN) {
                br = new BufferedReader( new InputStreamReader((System.in)));
                data = "down";
                try {
                    w = new BufferedWriter(new OutputStreamWriter((s.getOutputStream())));
                    w.write(data+"\n");
                    w.flush();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
            if(e.getKeyCode() == KeyEvent.VK_LEFT) {
                br = new BufferedReader( new InputStreamReader((System.in)));
                data = "left";
                try {
                    w = new BufferedWriter(new OutputStreamWriter((s.getOutputStream())));
                    w.write(data+"\n");
                    w.flush();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
            if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
                br = new BufferedReader( new InputStreamReader((System.in)));
                data = "right";
                try {
                    w = new BufferedWriter(new OutputStreamWriter((s.getOutputStream())));
                    w.write(data+"\n");
                    w.flush();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
            if(e.getKeyCode() == KeyEvent.VK_P) {
                br = new BufferedReader( new InputStreamReader((System.in)));
                data = "P";
                try {
                    w = new BufferedWriter(new OutputStreamWriter((s.getOutputStream())));
                    w.write(data+"\n");
                    w.flush();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}