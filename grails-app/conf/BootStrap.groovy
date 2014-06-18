import com.tekdays.*
class BootStrap {

    def init = { servletContext ->
		new TekUser(
			fullName: 'John Doe',
			userName: 'jdoe',
			password: 't0ps3cr3t',
			email: 'jdoe@johnsgroovyshop.com',
			website: 'jdoe.blogspot.com',
			bio: '''John is a silly goose. Conveniently reintermediate mission-critical imperatives via client-focused niches. Assertively orchestrate professional methodologies via principle-centered e-tailers. Phosfluorescently pontificate team driven data through plug-and-play collaboration and idea-sharing. Quickly generate resource sucking internal or "organic" sources after distinctive human capital. Phosfluorescently negotiate efficient ideas via vertical functionalities.'''
			).save()
		new TekUser(
			fullName: 'David Tractor',
			userName: 'tractorman',
			password: 'vr00mvr00m',
			email: 'dtractor@vroom.com',
			website: 'www.vroom.com',
			bio: '''David likes to go fast! Interactively supply user-centric paradigms without proactive networks. Efficiently morph cross-platform niches via revolutionary interfaces. Rapidiously deploy holistic manufactured products with worldwide process improvements. Efficiently exploit B2B ROI through virtual markets. Phosfluorescently conceptualize multimedia based imperatives for next-generation technology.'''
			).save()
		def event1 = new TekEvent(
				name: 'Groovy Beginners Camp',
				organizer: TekUser.findByUserName('jdoe'),
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
				organizer: TekUser.findByUserName('tractorman'),
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
		def g1 = TekEvent.findByName('Groovy Beginners Camp')
		g1.addToVolunteers(new TekUser(
				fullName: 'Sarah Jones',
				userName: 'sjones',
				password: 'letmein',
				email: 'sjones@something.com',
				website: 'www.bloghere.com',
				bio: 'Web Designer and Grails afficionado.'
			))
		g1.addToVolunteers(new TekUser(
				fullName: 'George Lopez',
				userName: 'GogoLopo',
				password: '12345',
				email: 'Cancan123@oodles.com',
				website: 'www.website.com',
				bio: 'Software developer extraordinaire!'
			))
		g1.save()
    }
    def destroy = {
    }
}
