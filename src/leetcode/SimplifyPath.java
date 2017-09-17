package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class SimplifyPath {
	public String simplifyPath(String path){
		Deque<String> s = new LinkedList<String>();
		Set<String> sk = new HashSet<String>(Arrays.asList("..", ".", ""));
		for(String dir : path.split("/")){
			if(dir.equals("..") && !s.isEmpty())
				s.pop();
			else if(!sk.contains(dir))
				s.push(dir);
		}
		String res = "";
		for(String dir : s)
			res = "/" + dir + res;
		return res.isEmpty()? "/" : res;
	}
	public static void main(String[] args)throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String path = in.readLine();
		SimplifyPath sp = new SimplifyPath();
		path = sp.simplifyPath(path);
		System.out.println(path);
	}
}
