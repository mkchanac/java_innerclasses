package InnerClasses;

// a new Class call Button, has 2 field, String type title, and OnClickListener interface type;
// so interface also can be inside the Class object. inner interface
// we also create a method call onClick in the interface.

public class Button {
	private String title;
	private OnClickListener onClickListener;
	
	public Button(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}
	public void onClick() {
		this.onClickListener.onClick(this.title);
	}
	
	public interface OnClickListener {
		public void onClick(String title);
	}
	
	
	
}
