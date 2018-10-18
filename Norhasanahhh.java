package AplikasiAbsenSiswa;


    

import javax.swing.*;
import java.awt.event.*;

public class Norhasanahhh extends JFrame {    
    JLabel lblNama=new JLabel("Nama");
    JTextField txNama=new JTextField(20);    
    JLabel lblKelas=new JLabel("Kelas");    
    JTextField txKelas=new JTextField(7);   
    JLabel lblTanggal=new JLabel("Tanggal");    
    JTextField txTanggal=new JTextField(8);
    JLabel lblJK=new JLabel("Jenis Kelamin");    
    JRadioButton LakiLaki=new JRadioButton("Laki-Laki");    
    JRadioButton perempuan=new JRadioButton("Perempuan");    
    ButtonGroup kelompok=new ButtonGroup();    
    JLabel lblAbsen=new JLabel("Absen");    
    JCheckBox Alpa=new JCheckBox("Alpa");    
    JCheckBox Izin=new JCheckBox("Izin");    
    JCheckBox Sakit=new JCheckBox("Sakit");    
    JButton SIMPAN=new JButton("SIMPAN");    
    JTextArea hasil=new JTextArea(); 
 
   Norhasanahhh()    {       
       setTitle("Aplikasi Absen Siswa MI Miftahul Khairiyah");
       setLocation(300,300);       
       setSize(300,320);       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
   } 
 
   void KomponenVisual()    
   {       
       getContentPane().setLayout(null);
       getContentPane().add(lblNama);       
       lblNama.setBounds(10,10,80,20);       
       getContentPane().add(txNama);       
       txNama.setBounds(105,10,175,20);       
       getContentPane().add(lblKelas);       
       lblKelas.setBounds(13,30,100,20);       
       getContentPane().add(txKelas);       
       txKelas.setBounds(105,33,175,20);  
       getContentPane().add(lblTanggal);       
       lblTanggal.setBounds(13,50,100,20);       
       getContentPane().add(txTanggal);       
       txTanggal.setBounds(105,60,175,20);       
       getContentPane().add(lblJK);       
       lblJK.setBounds(10,90,80,20);       
       kelompok.add(LakiLaki);       
       kelompok.add(perempuan);      
       getContentPane().add(LakiLaki);      
       LakiLaki.setBounds(105,90,100,20);       
       getContentPane().add(perempuan); 
       perempuan.setBounds(200,90,100,20);     
       getContentPane().add(lblAbsen);       
       lblAbsen.setBounds(10,120,75,20);       
       getContentPane().add(Alpa);       
       Alpa.setBounds(105,120,100,20);       
       getContentPane().add(Izin);       
       Izin.setBounds(105,140,100,20);       
       getContentPane().add(Sakit);       
       Sakit.setBounds(105,165,100,20);       
       getContentPane().add(SIMPAN);       
       SIMPAN.setBounds(10,200,270,20);       
       getContentPane().add(hasil);       
       hasil.setBounds(10,220,200,150);       
       setVisible(true);    
   } 
 
   void AksiReaksi()   
   {
       SIMPAN.addActionListener(new ActionListener()               
       {
       public void actionPerformed(ActionEvent e)          
       {
       hasil.append(txNama.getText()+"\n");  
       hasil.append(txKelas.getText()+"\n");            
       if(LakiLaki.isSelected()==true)             
       {                
hasil.append(LakiLaki.getText()+"\n");            
}             else             {                
hasil.append(perempuan.getText()+"\n");             
} 
 
            if(Alpa.isSelected()==true)            
{               
hasil.append(Alpa.getText()+"\n");             
}             if(Izin.isSelected()==true)             {  
hasil.append(Izin.getText()+"\n");             }         
if(Sakit.isSelected()==true)             {           
hasil.append(Sakit.getText()+"\n");             
} 
   }       
       });    
   } 
 
   public static void main(String args[])    {       
       Norhasanahhh e5=new Norhasanahhh();       
       e5.KomponenVisual();       
       e5.AksiReaksi();    
   } 
} 

