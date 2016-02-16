
import java.awt.Color;
import java.awt.Component;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayushgrg
 */
public class clientmain extends javax.swing.JFrame {

    /**
     * Creates new form clientmain
     */
    public clientmain() throws IOException {
        initComponents();
        frndipinfo = new HashMap<>();
        frndportinfo = new HashMap<>();
        chatwinfo = new HashMap<>();
        cw = new ArrayList<>();
        
        Enumeration e;
        try {
            e = NetworkInterface.getNetworkInterfaces();
            while(e.hasMoreElements())
            {
                NetworkInterface n = (NetworkInterface) e.nextElement();
                Enumeration ee = n.getInetAddresses();
                while (ee.hasMoreElements())
                {
                    InetAddress i = (InetAddress) ee.nextElement();
                    if(i instanceof Inet4Address){                      
                        System.out.println(i.getHostAddress());
                        ip.addItem(i.getHostAddress());  
                    }
                    
                   
                }
            }
        } catch (SocketException ex) {
            Logger.getLogger(clientmain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fList = new javax.swing.JList<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usrname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pswd = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        frndlist = new javax.swing.JButton();
        fn = new javax.swing.JLabel();
        addfrnd = new javax.swing.JTextField();
        afrnd = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        port = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        ip = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        aip = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("                                       WELCOME TO FCHAT");

        jLabel2.setText("           FRIEND'S LIST");

        fList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        fList.setEnabled(false);
        fList.setSelectionBackground(new java.awt.Color(0, 255, 51));
        fList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(fList);

        jLabel3.setText("               LOGIN");

        jLabel4.setText("USERNAME");

        jLabel5.setText("PASSWORD");

        login.setText("LOG IN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        frndlist.setText("REFRESH FRIEND'S LIST");
        frndlist.setEnabled(false);
        frndlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frndlistActionPerformed(evt);
            }
        });

        fn.setText("FRIEND NAME");
        fn.setEnabled(false);

        addfrnd.setEnabled(false);
        addfrnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfrndActionPerformed(evt);
            }
        });

        afrnd.setText("ADD FRIEND");
        afrnd.setEnabled(false);
        afrnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afrndActionPerformed(evt);
            }
        });

        jLabel7.setText("CLIENT IP: ");

        jLabel8.setText("PORT:  ");

        jLabel9.setText("AUTH IP");

        aip.setText("localhost");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(afrnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(addfrnd, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(frndlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(aip, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pswd, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(usrname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(6, 6, 6)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ip, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ip, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aip))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usrname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pswd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addfrnd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(afrnd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frndlist, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void afrndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afrndActionPerformed
        // add friend
        String adfrnd = addfrnd.getText();
        if(adfrnd != "" && adfrnd != null)
            addFriend(adfrnd);
        else
            JOptionPane.showMessageDialog(this, "Enter valid username");
    }//GEN-LAST:event_afrndActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // login
        
        if(login.getText().equals("LOG IN")){
            if(!port.getText().equals("") && port.getText()!=null && !aip.getText().equals("") && aip.getText()!=null){
                chatPort = Integer.parseInt(port.getText());
                IP = ip.getSelectedItem().toString();   // client ip
                authIp = aip.getText().toString();
                String uname = usrname.getText().toString();
                String pwd = pswd.getText().toString();
                authenticate(uname, pwd);
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Enter valid IP address/ port");
            }
        }
        else{
            authenticate(client, "");
            addfrnd.setEnabled(false);
            afrnd.setEnabled(false);
            client=""; 
            fList.setEnabled(false);
            fn.setEnabled(false);
            frndlist.setEnabled(false);
            for(chatwindow c: cw){
                c.setVisible(false);
            }
            frndipinfo.clear();
            frndportinfo.clear();
            chatwinfo.clear();
            cw.clear();
            usrname.setEditable(true);
            usrname.setText("");
            pswd.setText("");
            pswd.setEditable(true);
            aip.setEditable(true);
            port.setEditable(true);
            ip.setEditable(true);
            
            login.setText("LOG IN");
            
        }
    }//GEN-LAST:event_loginActionPerformed

    private void frndlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frndlistActionPerformed
        // refreshing list
        RefreshFriendList();
    }//GEN-LAST:event_frndlistActionPerformed

    private void fListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fListMouseClicked
        // TODO add your handling code here:
        String selected = fList.getSelectedValue();
        
        if(selected.substring(selected.length()-2, selected.length()).equals("-A"))
            openChatWindow(selected.substring(0, selected.length()-2));
        else{
            JOptionPane.showMessageDialog(this, selected + " is not online now.");
        }
    }//GEN-LAST:event_fListMouseClicked

    private void addfrndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfrndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addfrndActionPerformed

    
    void addFriend(String str){
         try {
                Socket s = new Socket(authIp,authServerPort);
                String msg = "AddFriend"+ "#" +client +"#" + str;
                dout = new DataOutputStream(s.getOutputStream());
                dout.writeUTF(msg);
                System.out.println("data sent");
                din = new DataInputStream(s.getInputStream());
                String read = din.readUTF();
                 if(read.equals("Valid")){
                    JOptionPane.showMessageDialog(this, "Friend added successfully!!!");
                }
                else if(read.equals("NotExist")){
                    JOptionPane.showMessageDialog(this, "Friend already added!!!");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Username doesnot exist");
                }
                s.close();
                
            } catch (IOException ex) {
                Logger.getLogger(clientmain.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    void RefreshFriendList(){ 
        Socket s;
        try {
            frndportinfo.clear();
            frndipinfo.clear();
            s = new Socket(authIp,authServerPort);
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            String sendRequest = "RefreshList"+"#"+client;
            dout.writeUTF(sendRequest);
            String read = din.readUTF();
            System.out.println(""+read);
            if(read.equals("")){
                JOptionPane.showMessageDialog(this, "No friend added!!!");
                return;
            }
            String list[] = read.split("#");
            System.out.println("List is"+ Arrays.toString(list));
            int i =0;
            final DefaultListModel model = new DefaultListModel();
            for(String name: list){
                String[] tmplist = name.split(":");
                if(tmplist[0].equals("A")){
                    frndportinfo.put(tmplist[1], tmplist[2]);
                    frndipinfo.put(tmplist[1], tmplist[3]);
                    model.add(i, tmplist[1]+"-A");
                    
                    System.out.println(name +  "->");
                    i++;
                }
                else{
                    model.add(i, tmplist[1]);
                    i++;
                }
                
            }
            fList.setCellRenderer(new SelectedListCellRenderer());
            fList.setModel(model);
           
        } catch (IOException ex) {
            Logger.getLogger(clientmain.class.getName()).log(Level.SEVERE, null, ex);
        }
        

         
    }
    
    public class SelectedListCellRenderer extends DefaultListCellRenderer {
        @Override
     public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
         Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
         if (isSelected) {
             c.setBackground(new Color(10,150,12,2));
         }
         
         if (value.toString().contains("-A")) setBackground(new Color(51,204,51));
         else setBackground(new Color(255,255,255));
       
         return c;
     }
    }
    
    void openChatWindow(String selected){
        System.out.println(""+selected);
        chatwindow c = new chatwindow();
        
        c.addWindowListener(new WindowListener() {
            

            @Override
            public void windowClosing(WindowEvent e) {
                cw.remove(chatwinfo.get(c.frndName));
                chatwinfo.remove(c.frndName);
            }

            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
           }

            @Override
            public void windowDeiconified(WindowEvent e) {
           }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
           }

        });
        
        
        
        cw.add(c);
        chatwinfo.put(selected, cw.size()-1);
       // chatBoxRecord.put(selected.split("-")[0],c);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                c.setTitle(""+client+" to "+selected);
                c.setClientName(client);
                c.setIPAddress(frndipinfo.get(selected));
                c.setFriendPort(frndportinfo.get(selected));
                c.setFriendName(selected);
                c.setVisible(true);
            }
        });
    }
    
     void authenticate(String uname, String pwd) {
        if(login.getText().equals("LOG IN")){
            System.out.println("clicked");
            if(uname.equals("") || pwd.equals("")){
               JOptionPane.showMessageDialog(this, "Enter valid username/password");
            }
            else{
               System.out.println("Trying Log In");
               try {

                   Socket s = new Socket(authIp,authServerPort);
                   String msg = "Auth"+ "#" +uname +"#" + pwd + "#" + IP + "#"+ chatPort;
                   dout = new DataOutputStream(s.getOutputStream());
                   dout.writeUTF(msg);
                   System.out.println("data sent");

                   din = new DataInputStream(s.getInputStream());
                   String read = din.readUTF();
                   client = uname;
                   if(read.equals("Valid")){

                       System.err.println("Valid User"+ client);
                       System.out.println("Client is Mr:"+client);
                       usrname.setEditable(false);
                       
                       pswd.setEditable(false);
                       aip.setEditable(false);
                       port.setEditable(false);
                       ip.setEditable(false);
                       login.setText("LOG OUT");
                       JOptionPane.showMessageDialog(this, "Welcome Mr."+client);
                       addfrnd.setEnabled(true);
                       afrnd.setEnabled(true);
                       fList.setEnabled(true);
                       fn.setEnabled(true);
                       frndlist.setEnabled(true);
                       RefreshFriendList();
                       clientChatPort();
                   }
                   else{
                       System.err.println("Invalid User"+ client);
                       JOptionPane.showMessageDialog(this, "Invalid username/password");
                   }

                   s.close();

               } catch (IOException ex) {
                   Logger.getLogger(clientmain.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        }
        else{
            try {

                   Socket s = new Socket(authIp,authServerPort);
                   String msg = "Logout"+ "#" +uname;
                   dout = new DataOutputStream(s.getOutputStream());
                   dout.writeUTF(msg);
                   System.out.println("data sent");

                   din = new DataInputStream(s.getInputStream());
                   String read = din.readUTF();
                   if(read.equals("DONE")){
                       login.setText("LOG IN");
                       clientChatPort();  
                   }
                   else{
                       JOptionPane.showMessageDialog(this, "Some error occurred!!!");
                   }
                   s.close();
                   
            }catch (IOException ex) {
                   Logger.getLogger(clientmain.class.getName()).log(Level.SEVERE, null, ex);
               }
        }
        
    }                                  
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(clientmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new clientmain().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(clientmain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    void clientChatPort() throws IOException{
       
        if(login.getText().equals("LOG OUT")){
            chatSocket = new ServerSocket(chatPort);
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    while(true){
                        RefreshFriendList();
                        DataInputStream din = null;
                        try {
                            System.out.println("New Winodw trying accepting");
                            Socket s = chatSocket.accept();
                            System.out.println("New Winodw accepted");
                            din = new DataInputStream(s.getInputStream());
                            String msg = din.readUTF();
                            String sender = msg.split(":")[0];
                            String message = msg.split(":")[1];
                            System.out.println("Sender : " + sender);
                            System.out.println("Message : " + message);
                            if(chatwinfo.get(sender)==null){
                                openChatWindow(sender);
                            }
                            cw.get(chatwinfo.get(sender)).setMessage(message);
                            dout = new DataOutputStream(s.getOutputStream());
                            dout.writeUTF("Sent");
                            s.close();
                        } catch (IOException ex) {
                            Logger.getLogger(clientmain.class.getName()).log(Level.SEVERE, null, ex);
                        } 
                    }
                }
            };
            t1 = new Thread(r);
            t1.start();
        }
        else{
            chatSocket.close();
                t1.stop();
        }
        
    }
    
    ServerSocket chatSocket;
    private int authServerPort = 6544;
    private String authIp = "";
    private int chatPort;
    private DataOutputStream dout;
    private DataInputStream din;
    private HashMap<String, String> frndportinfo;
    private HashMap<String, String> frndipinfo;
    private String client=""; 
    private HashMap<String, Integer> chatwinfo;
    private String IP = "localhost";
    ArrayList<chatwindow> cw;
    Thread t1 = null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addfrnd;
    private javax.swing.JButton afrnd;
    private javax.swing.JTextField aip;
    private javax.swing.JList<String> fList;
    private javax.swing.JLabel fn;
    private javax.swing.JButton frndlist;
    private javax.swing.JComboBox<String> ip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton login;
    private javax.swing.JTextField port;
    private javax.swing.JPasswordField pswd;
    private javax.swing.JTextField usrname;
    // End of variables declaration//GEN-END:variables
}
