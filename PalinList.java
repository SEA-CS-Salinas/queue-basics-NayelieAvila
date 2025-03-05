//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Nayelie

import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList()
	{
		setList("");
	}

	public PalinList(String list)
	{
		setList(list);
	}

	public void setList(String list)
	{
		queue = new LinkedList<>();
		stack = new Stack<>();

		String[] words = list.split(" ");
		for (String word : words) {
			queue.offer(word);
			stack.push(word);
		}
	}

	public boolean isPalin() {
		while(!queue.isEmpty()) {
			if(!queue.poll().equals(stack.pop())) {
				return false;
			}
		}
		return true;
	}


	//write a toString method

	public String toString() {
			return queue.toString() + (isPalin() ? " is a palinList. " : " is not a palinList.");

		}
	
}





