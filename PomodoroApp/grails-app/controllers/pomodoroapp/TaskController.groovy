package pomodoroapp

import grails.converters.JSON

class TaskController {
	static scaffold = Task
	
	def index={
		def tasks=pomodoroapp.Task.findAllByStatus("Open", [sort: "deadline", order:"asc"])
		
		def tags=pomodoroapp.Tag.list(sort:"name",order:"asc")
		
		return[tasks:tasks, tags:tags]
	}
	
	def mobileFeed={
		render Tag.list(sort:"name",order:"asc") as JSON
	}
}
