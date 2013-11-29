package pomodoroapp

class Tag {

	String name
	
	static hasMany = [tasks: Task]
	static belongsTo = pomodoroapp.Task
	
    static constraints = {
		name blank: false, unique: true
    }
	
	String toString(){ return name }
}
