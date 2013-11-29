package pomodoroapp

class Task {

	String summary
	String details
	String status
	Date dateCreated
	Date deadline
	Long timeSpent = 0L
	String procrastinable
	
	static hasMany = [tags: pomodoroapp.Tag]
	
    static constraints = {
		summary blank:false, unique: true
		details blank:false,maxSize:1000
		status inList:["Open","Done"]
		deadline nullable:true
		timeSpent min: 0L
		procrastinable inList:["Yes","No"]
    }
}
