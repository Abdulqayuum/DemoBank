package Code;


import Gui.Login;
import Gui.Splash;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aamir
 */
public class Splash_code {
    public static void main(String[] args) {
        Login l = new Login();
        Splash splash = new Splash();
        splash.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
            Thread.sleep(50);
            splash.jLabel1.setText(""+i);
            splash.jProgressBar1.setValue(i);
            if(i == 30){
                splash.connectlbl.setText("Connecting......");
            }
            if(i == 100){
                splash.connectlbl.setText("");
                splash.setVisible(false);
                l.setVisible(true);
            }
        }
                  
        }catch(NullPointerException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
