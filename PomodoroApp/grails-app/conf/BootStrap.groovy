import pomodoroapp.Tag
import pomodoroapp.Task

class BootStrap {

    def init = { servletContext ->
		def workTag = new Tag(name: "Work").save(failOnError: true)
		def homeTag = new Tag(name: "Home").save(failOnError: true)
		
		def task1 = new Task(	summary: 	"task 1 summary notes",
								details:  	"details of task1 must be very detailed",
								status:		"Open")
								
		task1.addToTags(workTag);
		task1.addToTags(homeTag);
		task1.save(failOnError: true)
		
    }
    def destroy = {
    }
}
