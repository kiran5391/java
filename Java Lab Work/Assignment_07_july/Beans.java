import java.util.Objects;

public class Beans 
{
	private String color;
	private String shape;
	private String type;
	private String origin;
	
	public Beans(String color,String shape,String type,String origin)
	{
		setColor(color);
		setShape(shape);
		setType( type);
		setOrigin( origin);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(origin);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Beans))
			return false;
		Beans other = (Beans) obj;
		return Objects.equals(origin, other.origin) ;
	}
	
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}
	public String getShape() 
	{
		return shape;
	}
	public void setShape(String shape)
	{
		this.shape = shape;
	}
	public String getType() 
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	public String getOrigin() 
	{
		return origin;
	}
	public void setOrigin(String origin) 
	{
		this.origin = origin;
	}
	
}
