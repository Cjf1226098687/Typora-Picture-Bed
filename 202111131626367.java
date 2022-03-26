package com.fc.g.a_file;

import java.io.File;

// ��������
public class Demo7 {
	public static void main(String[] args) {
		File file = new File("C:/Users/Buffer/Desktop/�½��ļ���");
		
		deleteAll(file);
	}

	/**
	 * ɾ��ָ���ļ���Ӧ��Ŀ¼�µ���������
	 * @param file
	 */
	public static void deleteAll(File file) {
		File[] listFiles = file.listFiles();
		
		for (File temp : listFiles) {
//			System.out.println(temp);
			
			// ������ļ���ֱ��ɾ��
			if (temp.isFile()) {
				temp.delete();
			}
			
			// ������ļ���
			if (temp.isDirectory()) {
				// �ݹ�������ļ����µ��������ݲ�ɾ��
				deleteAll(temp);
				
				// ɾ���յ��ļ���
				temp.delete();
			}
		}
	}
}
