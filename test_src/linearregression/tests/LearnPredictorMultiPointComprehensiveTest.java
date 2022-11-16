package linearregression.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import linearregression.PredictorUtils;
import linearregression.PredictorBasedOnX;
import linearregression.XY;
import test.cse131.UnitTestUtils;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
@RunWith(Parameterized.class)
public class LearnPredictorMultiPointComprehensiveTest {
	private final List<XY> points;
	private final double x;
	private final double expected;

	public LearnPredictorMultiPointComprehensiveTest(List<XY> points, double x, double expected) {
		super();
		this.points = points;
		this.x = x;
		this.expected = expected;
	}

	@Test
	public void test() {
		PredictorBasedOnX predictor = PredictorUtils.learnPredictor(points);
		assertEquals(expected, predictor.predict(x), UnitTestUtils.reasonableDelta());
	}

	@Parameterized.Parameters(name = "xys: {0}, x: {1}")
	public static Collection<Object[]> getConstructorArguments() {
		Collection<Object[]> args = new LinkedList<>();
		
		// random cases
		args.add(new Object[] {Arrays.asList(new XY(-1.3009393443066486, -6.08040602225711), new XY(4.229159752072377, -1.4007751484484903)), -6.382187760074773, -10.380214497568002});
		args.add(new Object[] {Arrays.asList(new XY(-5.856563226252948, -0.6391075758580573), new XY(-0.15136302052310313, -2.2684509275310605)), 8.007373177986935, -4.598497569846154});
		args.add(new Object[] {Arrays.asList(new XY(2.276472075233496, -2.9565683814033488), new XY(-4.631215257299768, 4.935043955657788)), 1.9588265584979325, -2.5936777122098387});
		args.add(new Object[] {Arrays.asList(new XY(9.381961678048032, 0.09781029662525498), new XY(7.065468986148318, 8.522618448060761)), -9.779454012474233, 69.78559807469432});
		args.add(new Object[] {Arrays.asList(new XY(-4.507023573731419, 0.15273512536219158), new XY(-0.362455851309452, -6.082271769328374), new XY(-6.171675564099786, 0.8306833270638059)), -0.3392262988217283, -5.876651316200736});
		args.add(new Object[] {Arrays.asList(new XY(-7.461296369297883, -7.8696874091201945), new XY(5.890164698605179, 2.2872518026353745), new XY(7.647582783818969, -2.6934278673323213)), 9.157872762671463, 0.8119296733532613});
		args.add(new Object[] {Arrays.asList(new XY(-8.625780632462474, -3.5809463704510636), new XY(-7.5222407252003265, 4.63212900199286), new XY(-3.4310004076558513, 8.429919184025646)), 5.174736478406603, 25.81043223501592});
		args.add(new Object[] {Arrays.asList(new XY(0.7224363788778803, 0.4667207319451254), new XY(9.744890109220904, -5.276527653397487), new XY(9.756005610938875, -7.752676339869606)), -5.7100852663962565, 5.444104810562598});
		args.add(new Object[] {Arrays.asList(new XY(0.9252011312801116, 9.355860855127425), new XY(-0.9111526113619117, 9.010246102534229), new XY(9.049545908767385, -2.1384393986180106), new XY(1.1266507240600614, 8.939337872913796)), 7.1934595145122735, 0.5367147525518696});
		args.add(new Object[] {Arrays.asList(new XY(4.654944644473218, 8.325869935602839), new XY(-8.941423940070123, 1.2189925108889774), new XY(8.069750448698997, 8.357090890108413), new XY(-8.293239796311626, 9.768068227172808)), -1.4946663027319431, 6.845028033662968});
		args.add(new Object[] {Arrays.asList(new XY(3.4128485215159863, -8.697852165691096), new XY(7.262574632298048, 2.431140911394607), new XY(0.8752348221773474, -7.731210154802721), new XY(-3.6667328553503094, -5.840016347270758)), 7.842549897316399, -1.0752430707070868});
		args.add(new Object[] {Arrays.asList(new XY(1.3127790511762747, -7.218884388934432), new XY(6.584573358282714, 2.745588979003422), new XY(-4.4270401211492665, -4.040113623590347), new XY(9.513181974576877, -1.3681932488642445)), 3.6745296032238386, -2.2976813277886885});
		args.add(new Object[] {Arrays.asList(new XY(-4.621084411338532, -5.193302550526441), new XY(-7.831729517459607, 7.342887829949298), new XY(-9.639825967779323, -8.789248935524396), new XY(-9.988047746693201, 6.988985924846894), new XY(-6.256107548396528, 8.593000182846403)), -0.08141465693149108, 0.3936403237996544});
		args.add(new Object[] {Arrays.asList(new XY(-4.443661994974155, -7.077839058877062), new XY(1.2370570377942691, 7.8089494016293095), new XY(8.923758769503, -8.109920253133748), new XY(2.910953047542881, -6.015882284909477), new XY(8.286807848894867, -3.460805066782198)), 2.619451006866381, -3.242012873696512});
		args.add(new Object[] {Arrays.asList(new XY(-8.221153843537913, 0.1948142011649896), new XY(-7.921898596625205, -0.7340985152923025), new XY(0.16495286618532745, -6.70073328741271), new XY(-3.74973634021803, -4.1092331887922455), new XY(8.16417372064679, 7.373272784810329)), -5.07075087312394, -1.8352916386166078});
		args.add(new Object[] {Arrays.asList(new XY(9.720327486720215, -6.597339212178874), new XY(9.790668047274455, -2.293266057583647), new XY(2.950500698769712, -0.26307940704037236), new XY(-2.592704355882544, -9.751208311755555), new XY(1.007102829621111, -0.39633433650352856)), 7.665861478208559, -3.331731055955621});
		args.add(new Object[] {Arrays.asList(new XY(7.481134226329051, -0.034703847373844354), new XY(5.593701091201261, -8.250320890722167), new XY(7.074132882806779, -7.122636379034077), new XY(-7.277379476381151, -5.260466924647906), new XY(6.233598144683981, 5.949363986532889), new XY(7.968748738446763, 2.981791673267093)), -3.5365468078047986, -4.567200287861627});
		args.add(new Object[] {Arrays.asList(new XY(9.823627085076815, -3.128577415709632), new XY(-2.745204940682724, -9.248395141177166), new XY(-1.3345475899043926, 8.33035484769368), new XY(-8.175525169527567, 5.540449989162719), new XY(-9.68122037120332, 8.219485172143177), new XY(4.109046255742143, -4.121367755858991)), -5.512991637144211, 3.243978115718817});
		args.add(new Object[] {Arrays.asList(new XY(0.026379867209453067, 7.42652616782361), new XY(6.310809975765309, 2.7115566626819625), new XY(-3.5491064632445113, -9.822257730893831), new XY(-7.652649013167059, -6.137864867723795), new XY(9.74446393129233, -1.1785995615721827), new XY(7.7660339107517515, 1.919144859866151)), -9.455926583198915, -6.3135132361015085});
		args.add(new Object[] {Arrays.asList(new XY(-0.8733183610607078, 1.5329850490190395), new XY(-0.98000991186737, 5.052555387061872), new XY(-9.557252565109353, 4.790238822903156), new XY(6.057524198286469, -1.3604088321986971), new XY(-8.896552603537986, -6.857534773634821), new XY(-4.43976693827689, -9.714608658414534)), -0.41058967761719956, -0.7213907923558335});
		args.add(new Object[] {Arrays.asList(new XY(2.3855656637788503, -2.8498164022505375), new XY(-3.238283149170238, 5.698624738736839), new XY(-3.145005449815626, -5.433839589283691), new XY(-1.9574520431243734, -1.269485277471059), new XY(-1.26818612867973, -4.944173843576365), new XY(6.159368941027246, -4.432584686106038), new XY(3.9296589636541324, -3.1178568043343136)), 8.563687235495511, -5.478726445107739});
		args.add(new Object[] {Arrays.asList(new XY(-9.458728834902976, -4.4040699472885265), new XY(-1.2443008606607293, 4.032070714172482), new XY(-8.897720287640823, -0.20429872091891887), new XY(6.19599869755816, -5.7533710978449175), new XY(8.560110022693603, 9.606975387191717), new XY(-5.858837511690604, -2.5934584104738256), new XY(1.5472294027049998, -6.35891307153686)), 2.5669171296911095, 0.23802582433839192});
		args.add(new Object[] {Arrays.asList(new XY(-8.426132581487112, 1.3577871916627302), new XY(2.9121964240213956, -7.557871229322098), new XY(-5.070452622281998, 2.944395683739378), new XY(-3.985013482173403, -6.960429163904598), new XY(7.713159607321959, 3.1090717367784837), new XY(-3.2701768687613146, 8.436999810202849), new XY(-3.657365350955155, 8.303494656278875)), 0.4597975881122913, 0.8883197556635182});
		args.add(new Object[] {Arrays.asList(new XY(0.9850312570653585, -5.942184410878215), new XY(-1.5423514524776678, -3.6857756161622106), new XY(-7.415282728738262, 4.404377194263471), new XY(0.3848236838360979, -9.811665979644665), new XY(0.8091136524443776, 3.9723043515118857), new XY(-5.435141302570492, 0.8490365513675346), new XY(-3.7804381725816683, 9.025754577839567)), -7.513596273691723, 5.721354294182955});

		return args;
	}
}