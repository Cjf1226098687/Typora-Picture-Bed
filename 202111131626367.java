package com.fc.g.a_file;

import java.io.File;

// 谨慎操作
public class Demo7 {
	public static void main(String[] args) {
		File file = new File("C:/Users/Buffer/Desktop/新建文件夹");
		
		deleteAll(file);
	}

	/**
	 * 删除指定文件对应的目录下的所有内容
	 * @param file
	 */
	public static void deleteAll(File file) {
		File[] listFiles = file.listFiles();
		
		for (File temp : listFiles) {
//			System.out.println(temp);
			
			// 如果是文件，直接删除
			if (temp.isFile()) {
				temp.delete();
			}
			
			// 如果是文件夹
			if (temp.isDirectory()) {
				// 递归查找子文件夹下的所有内容并删除
				deleteAll(temp);
				
				// 删除空的文件夹
				temp.delete();
			}
		}
	}
}
