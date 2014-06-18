import com.tekdays.*
class BootStrap {

    def init = { servletContext ->
		def event1 = new TekEvent(
				name: 'Groovy Beginners Camp',
				organizer: 'Jean Luc Picard',
				venue: 'TBD',
				city: 'Marathon, FL',
				startDate: new Date("7/8/2014"),
				endDate: new Date("7/8/2014"),
				description: '''Quickly seize frictionless alignments with 24/365 best practices. 
Progressively pontificate turnkey portals via high-quality portals. 
Assertively enable cooperative information through long-term high-impact leadership skills. 
Dramatically coordinate high-quality imperatives vis-a-vis open-source vortals. 
Seamlessly repurpose out-of-the-box web-readiness for cross-media outsourcing.'''
			)
		if(!event1.save()) {
			event1.errors.allErrors.each{error ->
				println "An error occurred with event1: ${error}"
			}
		}
		def event2 = new TekEvent(
				name: 'Learn some Code! Camp',
				organizer: 'Mary Davis',
				venue: 'Academy Hall',
				city: 'Chicago, IL',
				startDate: new Date("7/29/2014"),
				endDate: new Date("7/30/2014"),
				description: '''Phosfluorescently deliver empowered collaboration and idea-sharing for resource maximizing solutions. 
Synergistically reconceptualize empowered vortals vis-a-vis error-free best practices. 
Credibly unleash ethical core competencies rather than optimal leadership. 
Progressively engineer client-based expertise via cutting-edge niches. 
Seamlessly transition efficient services without revolutionary mindshare.'''
			)
		if(!event2.save()) {
			event2.errors.allErrors.each{error ->
				println "An error occurred with event2: ${error}"
			}
		}
    }
    def destroy = {
    }
}
