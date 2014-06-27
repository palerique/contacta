package sitedo.ph.contacta;

import java.util.Locale;

import net.thucydides.jbehave.ThucydidesJUnitStories;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.Keywords;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.parsers.RegexStoryParser;

public class AcceptanceTestSuite extends ThucydidesJUnitStories {

	@Override
	public Configuration configuration() {

		Configuration configuration = super.configuration();

		 Keywords keywords = new LocalizedKeywords(new Locale("pt"));
		
		 configuration.useKeywords(keywords).useStoryParser(
		 new RegexStoryParser(keywords));

		return configuration;
	}
}
