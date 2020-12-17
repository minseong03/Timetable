package project2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("serial")
		JPanel page1 = new JPanel() {
			Image background=new ImageIcon(Main.class.getResource("/Image/image.png")).getImage();
			public void paint(Graphics g) {
				g.drawImage(background, 0, 0, null);
			}
		};
		
		JFrame JF = new JFrame("2-3반 시간표");
		JPanel JP = new JPanel();
		
		page1.setBounds(0, 0, 800, 430);
		
		JP.setLayout(null);
		JP.setBackground(new Color(50,50,50));
		
		String Fonts = "맑은 고딕";
		
		JButton BT_Programming = new JButton("");
		JButton BT_Programming2 = new JButton("");
		
		JButton BT_PE = new JButton("");
		
		JButton BT_Korean_History = new JButton("");
		JButton BT_Korean_History2 = new JButton("");
		JButton BT_Korean_History3 = new JButton("");
		
		JButton BT_Practical_English = new JButton("");
		JButton BT_Practical_English2 = new JButton("");
		JButton BT_Practical_English3 = new JButton("");
		
		JButton BT_Practical_Korean = new JButton("");
		JButton BT_Practical_Korean2 = new JButton("");
		
		JButton BT_Practical_Math = new JButton("");
		JButton BT_Practical_Math2 = new JButton("");
		
		JButton BT_Integrated_Society = new JButton("");
		
		JButton BT_Communication = new JButton("");
		JButton BT_Communication2 = new JButton("");
		
		JButton BT_Data_Structure = new JButton("");
		JButton BT_Data_Structure2 = new JButton("");
		
		JButton BT_Office_Management = new JButton("");
		JButton BT_Office_Management2 = new JButton("");
		
		JButton BT_Japanese = new JButton("");
		JButton BT_Japanese2 = new JButton("");
		
		JButton BT_Integrated_Science = new JButton("");
		
		JButton BT_Application_Programming = new JButton("");
		JButton BT_Application_Programming2 = new JButton("");
		
		JButton BT_Career = new JButton("");
		
		JButton BT_2nd_grade_Class_3 = new JButton("2학년 3반 클래스룸");
		
		BT_Programming.setBackground(Color.white);
        BT_Programming.setContentAreaFilled(false);
        BT_Programming.setOpaque(false);
        
        BT_Programming2.setBackground(Color.white);
        BT_Programming2.setContentAreaFilled(false);
        BT_Programming2.setOpaque(false);
        
        BT_PE.setBackground(Color.white);
        BT_PE.setContentAreaFilled(false);
        BT_PE.setOpaque(false);
        
        BT_Korean_History.setBackground(Color.white);
        BT_Korean_History.setContentAreaFilled(false);
        BT_Korean_History.setOpaque(false);
        
        BT_Korean_History2.setBackground(Color.white);
        BT_Korean_History2.setContentAreaFilled(false);
        BT_Korean_History2.setOpaque(false);
        
        BT_Korean_History3.setBackground(Color.white);
        BT_Korean_History3.setContentAreaFilled(false);
        BT_Korean_History3.setOpaque(false);
        
        BT_Practical_English.setBackground(Color.white);
        BT_Practical_English.setContentAreaFilled(false);
        BT_Practical_English.setOpaque(false);
        
        BT_Practical_English2.setBackground(Color.white);
        BT_Practical_English2.setContentAreaFilled(false);
        BT_Practical_English2.setOpaque(false);
        
        BT_Practical_English3.setBackground(Color.white);
        BT_Practical_English3.setContentAreaFilled(false);
        BT_Practical_English3.setOpaque(false);
		
        BT_Practical_Korean.setBackground(Color.white);
        BT_Practical_Korean.setContentAreaFilled(false);
        BT_Practical_Korean.setOpaque(false);
        
        BT_Practical_Korean2.setBackground(Color.white);
        BT_Practical_Korean2.setContentAreaFilled(false);
        BT_Practical_Korean2.setOpaque(false);
        
        BT_Office_Management.setBackground(Color.white);
        BT_Office_Management.setContentAreaFilled(false);
        BT_Office_Management.setOpaque(false);
        
        BT_Office_Management2.setBackground(Color.white);
        BT_Office_Management2.setContentAreaFilled(false);
        BT_Office_Management2.setOpaque(false);
        
        BT_Data_Structure.setBackground(Color.white);
        BT_Data_Structure.setContentAreaFilled(false);
        BT_Data_Structure.setOpaque(false);
        
        BT_Data_Structure2.setBackground(Color.white);
        BT_Data_Structure2.setContentAreaFilled(false);
        BT_Data_Structure2.setOpaque(false);
        
        BT_Practical_Math.setBackground(Color.white);
        BT_Practical_Math.setContentAreaFilled(false);
        BT_Practical_Math.setOpaque(false);
        
        BT_Practical_Math2.setBackground(Color.white);
        BT_Practical_Math2.setContentAreaFilled(false);
        BT_Practical_Math2.setOpaque(false);
        
        BT_Japanese.setBackground(Color.white);
        BT_Japanese.setContentAreaFilled(false);
        BT_Japanese.setOpaque(false);
        
        BT_Japanese2.setBackground(Color.white);
        BT_Japanese2.setContentAreaFilled(false);
        BT_Japanese2.setOpaque(false);
        
        BT_Communication.setBackground(Color.white);
        BT_Communication.setContentAreaFilled(false);
        BT_Communication.setOpaque(false);
        
        BT_Communication2.setBackground(Color.white);
        BT_Communication2.setContentAreaFilled(false);
        BT_Communication2.setOpaque(false);
        
        BT_Application_Programming.setBackground(Color.white);
        BT_Application_Programming.setContentAreaFilled(false);
        BT_Application_Programming.setOpaque(false);
        
        BT_Application_Programming2.setBackground(Color.white);
        BT_Application_Programming2.setContentAreaFilled(false);
        BT_Application_Programming2.setOpaque(false);
        
        BT_Integrated_Science.setBackground(Color.white);
        BT_Integrated_Science.setContentAreaFilled(false);
        BT_Integrated_Science.setOpaque(false);
        
        BT_Integrated_Society.setBackground(Color.white);
        BT_Integrated_Society.setContentAreaFilled(false);
        BT_Integrated_Society.setOpaque(false);
        
        BT_2nd_grade_Class_3.setBackground(Color.white);
        BT_2nd_grade_Class_3.setContentAreaFilled(false);
        BT_2nd_grade_Class_3.setOpaque(false);
        
        BT_Career.setBackground(Color.white);
        BT_Career.setContentAreaFilled(false);
        BT_Career.setOpaque(false);
        
		BT_Programming.setBounds(251,200,83,50);
		BT_Programming.setFont(new Font(Fonts,0,15));
		BT_Programming.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 프로그래밍
				String address = "https://classroom.google.com/u/1/c/NzYxOTgyNzU2ODBa";
				String zoom_address = "https://zoom.us/j/4886153392?pwd=VUNPK2lwRUpmRk1BaU1keTkvOStTdz09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Programming2.setBounds(417,250,83,50);
		BT_Programming2.setFont(new Font(Fonts,0,15));
		BT_Programming2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 프로그래밍
				String address = "https://classroom.google.com/u/1/c/NzYxOTgyNzU2ODBa";
				String zoom_address = "https://zoom.us/j/4886153392?pwd=VUNPK2lwRUpmRk1BaU1keTkvOStTdz09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});

		BT_PE.setBounds(168,100,83,50);
		BT_PE.setFont(new Font(Fonts,0,15));
		BT_PE.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 체육         
				String address = "https://classroom.google.com/u/1/c/NjY5MjcwMjYzMjda";
				String zoom_address = "https://us04web.zoom.us/j/3286503154?pwd=dkVHL0d0Y1dDQjVWQTZiQVZ3L253QT09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});

		BT_Korean_History.setBounds(500,100,83,50);
		BT_Korean_History.setFont(new Font(Fonts,0,15));
		BT_Korean_History.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 한국사
				String address = "https://classroom.google.com/u/1/c/NjY5MDc0MzY1MTha";
				String zoom_address = "https://us04web.zoom.us/j/6278990402?pwd=iRMR8_IjuDLeALRlyp2473Y";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Korean_History2.setBounds(417,150,83,50);
		BT_Korean_History2.setFont(new Font(Fonts,0,15));
		BT_Korean_History2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 한국사
				String address = "https://classroom.google.com/u/1/c/NjY5MDc0MzY1MTha";
				String zoom_address = "https://us04web.zoom.us/j/6278990402?pwd=iRMR8_IjuDLeALRlyp2473Y";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Korean_History3.setBounds(85,250,83,50);
		BT_Korean_History3.setFont(new Font(Fonts,0,15));
		BT_Korean_History3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 한국사
				String address = "https://classroom.google.com/u/1/c/NjY5MDc0MzY1MTha";
				String zoom_address = "https://us04web.zoom.us/j/6278990402?pwd=iRMR8_IjuDLeALRlyp2473Y";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});

		BT_Practical_English.setBounds(583,150,83,50);
		BT_Practical_English.setFont(new Font(Fonts,0,15));
		BT_Practical_English.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 실용영어
				String address = "https://classroom.google.com/u/1/c/NjY5MDM5NjkyMjVa";
				String zoom_address = "https://us04web.zoom.us/j/711109989?pwd=RkJOR0FFak02Yll1Z2E0ejZKZGdnUT09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Practical_English2.setBounds(249,250,85,50);
		BT_Practical_English2.setFont(new Font(Fonts,0,15));
		BT_Practical_English2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 실용영어
				String address = "https://classroom.google.com/u/1/c/NjY5MDM5NjkyMjVa";
				String zoom_address = "https://us04web.zoom.us/j/711109989?pwd=RkJOR0FFak02Yll1Z2E0ejZKZGdnUT09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Practical_English3.setBounds(168,300,83,50);
		BT_Practical_English3.setFont(new Font(Fonts,0,15));
		BT_Practical_English3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 실용영어
				String address = "https://classroom.google.com/u/1/c/NjY5MDM5NjkyMjVa";
				String zoom_address = "https://us04web.zoom.us/j/711109989?pwd=RkJOR0FFak02Yll1Z2E0ejZKZGdnUT09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Practical_Korean.setBounds(85,100,83,50);
		BT_Practical_Korean.setFont(new Font(Fonts,0,15));
		BT_Practical_Korean.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 실용국어
				String address = "https://classroom.google.com/u/1/c/NjY5MjA1ODI0MTFa";
				String zoom_address = "https://us02web.zoom.us/j/81529986239?pwd=VVJSeUY4TmJTaWtzYmpkV1NrK1hZQT09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Practical_Korean2.setBounds(168,250,83,50);
		BT_Practical_Korean2.setFont(new Font(Fonts,0,15));
		BT_Practical_Korean2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 실용국어
				String address = "https://classroom.google.com/u/1/c/NjY5MjA1ODI0MTFa";
				String zoom_address = "https://us02web.zoom.us/j/81529986239?pwd=VVJSeUY4TmJTaWtzYmpkV1NrK1hZQT09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Practical_Math.setBounds(500,150,83,50);
		BT_Practical_Math.setFont(new Font(Fonts,0,15));
		BT_Practical_Math.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 실용수학
				String address = "https://classroom.google.com/u/1/c/NjY5MjcwNDEwNzBa";
				String zoom_address = "https://us04web.zoom.us/j/3119594508?pwd=dTVreXJLQXFzdVNrTUp0aVpZUzdJUT09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Practical_Math2.setBounds(332,300,85,50);
		BT_Practical_Math2.setFont(new Font(Fonts,0,15));
		BT_Practical_Math2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 실용수학
				String address = "https://classroom.google.com/u/1/c/NjY5MjcwNDEwNzBa";
				String zoom_address = "https://us04web.zoom.us/j/3119594508?pwd=dTVreXJLQXFzdVNrTUp0aVpZUzdJUT09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Integrated_Society.setBounds(332,150,85,50);
		BT_Integrated_Society.setFont(new Font(Fonts,0,15));
		BT_Integrated_Society.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 통합사회
				String address = "https://classroom.google.com/u/1/c/Njg0OTY4NjUzMDVa";
				String zoom_address = "https://us04web.zoom.us/j/9265847746?pwd=aC9Ya1dMbUdhY2grUkk1SUNUOWhMZz09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Communication.setBounds(583,250,83,50);
		BT_Communication.setFont(new Font(Fonts,0,15));
		BT_Communication.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 커뮤니케이션
				String address = "https://classroom.google.com/u/1/c/NjgxNTk4MDI3NDRa";
				String zoom_address = "https://us02web.zoom.us/j/7307159537?pwd=VjY0NXM3bW1sZFE0M2c1WWZDdFN5QT09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Communication2.setBounds(85,300,83,50);
		BT_Communication2.setFont(new Font(Fonts,0,15));
		BT_Communication2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 커뮤니케이션
				String address = "https://classroom.google.com/u/1/c/MTMxOTU3MDA5NjYw";
				String zoom_address = "https://us04web.zoom.us/j/6328732161";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Data_Structure.setBounds(85,150,83,50);
		BT_Data_Structure.setFont(new Font(Fonts,0,15));
		BT_Data_Structure.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 자료구조
				String address = "https://classroom.google.com/u/1/c/NjY5MzYwNDA1NzFa";
				String zoom_address = "https://us04web.zoom.us/j/2024836949?pwd=V0lmWFRRL0R6Tm56QTdRUHNoMWI3QT09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Data_Structure2.setBounds(417,300,83,50);
		BT_Data_Structure2.setFont(new Font(Fonts,0,15));
		BT_Data_Structure2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 자료구조
				String address = "https://classroom.google.com/u/1/c/NjY5MzYwNDA1NzFa";
				String zoom_address = "https://us04web.zoom.us/j/2024836949?pwd=V0lmWFRRL0R6Tm56QTdRUHNoMWI3QT09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Office_Management.setBounds(251,100,83,50);
		BT_Office_Management.setFont(new Font(Fonts,0,15));
		BT_Office_Management.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 사무관리
				String address = "https://classroom.google.com/u/1/c/NjY5Mjg5MjA3OTFa";
				String zoom_address = "https://us04web.zoom.us/j/3792444361?pwd=cHU3aWNSQVpSV2NKd1FhVTR1VUVWdz09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Office_Management2.setBounds(332,250,85,50);
		BT_Office_Management2.setFont(new Font(Fonts,0,15));
		BT_Office_Management2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 사무관리
				String address = "https://classroom.google.com/u/1/c/NjY5Mjg5MjA3OTFa";
				String zoom_address = "https://us04web.zoom.us/j/3792444361?pwd=cHU3aWNSQVpSV2NKd1FhVTR1VUVWdz09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Japanese.setBounds(251,150,83,50);
		BT_Japanese.setFont(new Font(Fonts,0,15));
		BT_Japanese.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 일본어
				String address = "https://classroom.google.com/u/1/c/NjY5MjEzMTUxOTla";
				String zoom_address = "https://us02web.zoom.us/j/9200368948?pwd=V0lmWFRRL0R6Tm56QTdRUHNoMWI3QT09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Japanese2.setBounds(251,300,83,50);
		BT_Japanese2.setFont(new Font(Fonts,0,15));
		BT_Japanese2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 일본어
				String address = "https://classroom.google.com/u/1/c/NjY5MjEzMTUxOTla";
				String zoom_address = "https://us02web.zoom.us/j/9200368948?pwd=V0lmWFRRL0R6Tm56QTdRUHNoMWI3QT09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Integrated_Science.setBounds(417,100,83,50);
		BT_Integrated_Science.setFont(new Font(Fonts,0,15));
		BT_Integrated_Science.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 통합과학
				String address = "https://classroom.google.com/u/1/c/NjY4NjY5NzUzNDBa";
				String zoom_address = "https://us04web.zoom.us/j/2026848469?pwd=TitIVEZHNWdWNzNqdUtHUlBDc0ZCZz09";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Application_Programming.setBounds(85,200,83,50);
		BT_Application_Programming.setFont(new Font(Fonts,0,15));
		BT_Application_Programming.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 응용 프로그래밍   
				String address = "https://classroom.google.com/u/1/c/Njk0NjY2ODI4ODFa";
				String zoom_address = "https://zoom.us/j/9570779200";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Application_Programming2.setBounds(583,300,83,50);
		BT_Application_Programming2.setFont(new Font(Fonts,0,15));
		BT_Application_Programming2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 응용 프로그래밍   
				String address = "https://classroom.google.com/u/1/c/Njk0NjY2ODI4ODFa";
				String zoom_address = "https://zoom.us/j/9570779200";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_Career.setBounds(500,300,83,50);
		BT_Career.setFont(new Font(Fonts,0,15));
		BT_Career.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 진로
				String address = "https://classroom.google.com/u/1/c/OTE1NDY1NzA0Nzla";
				String zoom_address = "https://us04web.zoom.us/j/3047597244";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				String[] cmd2 = new String[] {"rundll32", "url.dll", "FileProtocolHandler", zoom_address};
				try {
					new ProcessBuilder(cmd).start();
					new ProcessBuilder(cmd2).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		BT_2nd_grade_Class_3.setBounds(10,10,165,30);
		BT_2nd_grade_Class_3.setFont(new Font(Fonts,0,15));
		BT_2nd_grade_Class_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {           // 2학년 3반 클래스룸
				String address = "https://classroom.google.com/u/1/c/NzAyODUyNTQwMTda";
				String[] cmd = new String[] {"rundll32", "url.dll", "FileProtocolHandler", address};
				try {
					new ProcessBuilder(cmd).start();
				}
				catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		
		JP.add(BT_Programming);
		JP.add(BT_Programming2);
		JP.add(BT_PE);
		JP.add(BT_Practical_English);
		JP.add(BT_Practical_English2);
		JP.add(BT_Practical_English3);
		JP.add(BT_Korean_History);
		JP.add(BT_Korean_History2);
		JP.add(BT_Korean_History3);
		JP.add(BT_Practical_Korean);
		JP.add(BT_Practical_Korean2);
		JP.add(BT_Practical_Math);
		JP.add(BT_Practical_Math2);
		JP.add(BT_Integrated_Society);
		JP.add(BT_Communication);
		JP.add(BT_Communication2);
		JP.add(BT_Data_Structure);
		JP.add(BT_Data_Structure2);
		JP.add(BT_Office_Management);
		JP.add(BT_Office_Management2);
		JP.add(BT_Japanese);
		JP.add(BT_Japanese2);
		JP.add(BT_Integrated_Science);
		JP.add(BT_Application_Programming);
		JP.add(BT_Application_Programming2);
		JP.add(BT_2nd_grade_Class_3);
		JP.add(BT_Career);
		JP.add(page1); // 이미지
		
		JF.setContentPane(JP);
		
		JF.setSize(682,389);
		JF.setResizable(false);
		JF.setVisible(true);
		
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로세스 종료
        JF.setContentPane(JP);
	}
}