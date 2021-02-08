package com.efrei.entities;
import java.util.List;

import javax.persistence.Column;




import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter 
public class RoomTags {
	private Integer Id;
	private String RoomTagType;
	private Integer RoomId;
	private Integer ViewId;
}
