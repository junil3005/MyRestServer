package learnbyteaching.todos.repositories.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor	 //	기본 생성자
@AllArgsConstructor	 //	생성자
@Getter
@Setter
@ToString
public class TodoItem {
	private Long id;
	private String title;
	private boolean completed;

	

}
