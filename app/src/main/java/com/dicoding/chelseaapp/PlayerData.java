package com.dicoding.chelseaapp;

import java.util.ArrayList;

public class PlayerData {
    private static String[] playerName = {
            "Keppa Arrizabalaga",
            "Willy Caballero",
            "Antonio Rudiger",
            "Marcos Alonso",
            "Andreas Christensen",
            "Cesar Azpilicueta",
            "Emerson Palmieri",
            "Kurt Zouma",
            "Rece James",
            "Fikayo Tomori",
            "Jorginho",
            "N'Golo Kante",
            "Ross Barkley",
            "Mateo Kovacic",
            "Mason Mount",
            "Pedro",
            "Callum Hudson-Odoi",
            "Olivier Giroud",
            "Willian Borges da Silva",
            "Michy Batshuayi",
            "Christian Pulisic",
            "Tammy Abraham"
    };

    private static String[] playerPosition = {
            "Goal Keeper",
            "Goal Keeper",
            "Center Back",
            "Left Back",
            "Center Back",
            "Right Back",
            "Left Back",
            "Center Back",
            "Right Back",
            "Center Back",
            "Defensive Midfielder",
            "Defensive Midfielder",
            "Center Midfielder",
            "Center Midfielder",
            "Attacking Midfielder",
            "Left Wing Forward",
            "Right Wing Forward",
            "Center Forward",
            "Right Wing Forward",
            "Center Forward",
            "Left Wing Forward",
            "Center Forward"

    };

    private static String[] shortPos = {
            "GK",
            "GK",
            "CB",
            "LB",
            "CB",
            "RB",
            "LB",
            "CB",
            "RB",
            "CB",
            "DM",
            "DM",
            "CM",
            "CM",
            "AMF",
            "LWF",
            "RWF",
            "CF",
            "RWF",
            "CF",
            "LWF",
            "CF"
    };

    private static String[] numberPlayer = {
            "1",
            "13",
            "2",
            "3",
            "4",
            "28",
            "33",
            "15",
            "24",
            "29",
            "5",
            "7",
            "8",
            "17",
            "19",
            "11",
            "20",
            "18",
            "10",
            "23",
            "22",
            "9"
    };

    private static String[] playerAge = {
            "25",
            "38",
            "27",
            "29",
            "23",
            "30",
            "25",
            "25",
            "20",
            "22",
            "28",
            "29",
            "26",
            "25",
            "21",
            "32",
            "19",
            "33",
            "31",
            "26",
            "21",
            "22"
    };

    private static String[] playerHeight = {
            "186",
            "186",
            "190",
            "188",
            "187",
            "178",
            "176",
            "175",
            "185",
            "180",
            "168",
            "186",
            "176",
            "178",
            "169",
            "178",
            "193",
            "175",
            "185",
            "173",
            "191",
            "191"
    };

    private static String[] playerWeight = {
            "88",
            "83",
            "85",
            "85",
            "82",
            "77",
            "79",
            "95",
            "87",
            "68",
            "70",
            "87",
            "80",
            "70",
            "67",
            "79",
            "91",
            "77",
            "91",
            "70",
            "87",
            "87"
    };

    private static String[] playerBio = {
            "Kepa Arrizabalaga signed for Chelsea from Athletic Bilbao in August 2018. \n" +
                    "\n" +
                    "The Spanish international goalkeeper signed a seven-year contract at Stamford Bridge and ended his first season with silverware as we beat Arsenal in the Europa League final. He played 54 games in all competitions, including 36 in the Premier League. In total he kept an impressive 23 clean sheets as he quickly adapted to the rigours of English football. \n" +
                    "\n" +
                    "Kepa's performances for the Blues have also earned him regular playing time for Spain, the country of his birth in October 1994. \n" +
                    "\n" +
                    "Quick and agile, Kepa possesses fantastic reflexes and has developed his all-round game since he established himself as Athletic Bilbao’s first-choice ‘keeper. A great shot-stopper, he is confident with the ball at his feet and capable of playing out from the back, even under pressure.\n" +
                    "\n" +
                    "Kepa made his debut for the Blues just a few days after signing in our opening-day win at Huddersfield in August 2018. The keeper looked assured when called into action and kept a clean sheet in a 3-0 victory.\n" +
                    "\n" +
                    "He was an ever-present in the Premier League during the first half of the 2018/19 season and kept nine clean sheets. After Christmas we reached the Carabao Cup final with Kepa starring in the penalty shoot-out success over Tottenham in the semis, a feat he would repeat at the same stage of the Europa League against Eintracht Frankfurt when he decisively kept out two penalties to send us to Baku. Kepa's impressive form towards the finale of our domestic campaign played an important role in securing a third-placed Premier League finish. \n" +
                    "\n" +
                    "Born in Ondarroa, a Basque seaside town, Kepa joined the Athletic academy at the age of nine and after gaining experience at their fourth-tier feeder club Basconia, he appeared regularly for Bilbao’s B-team, earning international recognition at youth level due to the quality of his displays.\n" +
                    "\n" +
                    "Kepa was loaned to SD Ponferradina, a Spanish second division side, in January 2015 and having made his debut against Racing Santander, he started on a regular basis, keeping seven clean sheets in the process as the team missed out on the play-offs by just one point. He established himself in another second-tier loan move with Real Valladolid the next season, before returning to Bilbao for the 2016/17 campaign.\n" +
                    "\n" +
                    "Although not initially viewed as number one, he made his first appearance in an away game at Deportivo La Coruna, keeping a clean sheet in a 1-0 win. He went on to make over 20 appearances throughout a season which ended with him representing Spain at the European Under-21 Championship.\n" +
                    "\n" +
                    "Last season, Kepa’s consistently impressive displays earned him regular plaudits inside and outside the club. He saved two of the three penalties he faced, as well as making the third-highest number of saves in the Spanish top flight and successfully executing more long-range passes – 368 – than any other goalkeeper in La Liga.\n" +
                    "\n" +
                    "His impressive form at club level led to a debut for the senior Spain side, which came in a 5-0 win over Costa Rica last November. He was duly named in the 23-man squad for the World Cup in Russia, and by 2019 was a regular between the posts for his country. ",
            "Goalkeeper Willy Caballero joined Chelsea on 1 July 2017 having been out of contract at Manchester City.\n" +
                    "\n" +
                    "He was signed to add strength to our goalkeeper resources following the departure of Asmir Begovic to Bournemouth as he has a wealth of experience at the highest level. He spent the previous three seasons at City, having started his career at Boca Juniors in his native Argentina before playing for Spanish clubs Elche and Malaga.\n" +
                    "\n" +
                    "Caballero made his Chelsea debut in September 2017, in a 5-1 Carabao Cup game at home to Nottingham Forest. He was denied a debut clean sheet by a Forest goal right at the end of the game.\n" +
                    "\n" +
                    "It was a pattern that was followed in subsequent wins in the competition against Premier League Everton and Bournemouth, but Caballero did claim a clean sheet in the FA Cup when we drew 0-0 at Norwich. In the replay, having again conceded right at the end of the 90 minutes, the Argentinean was one of the heroes of a penalty shoot-out win.He played his first Premier League game for Chelsea in January 2018, making an outstanding save from a Tomer Hemed header in a 4-0 win at Brighton.\n" +
                    "\n" +
                    "Having been called up to the Argentina squad in March 2018, Caballero then made his debut for the national side at the age of 36 in a 2-0 friendly win over Italy. As well as keeping a clean sheet, the Chelsea 'keeper performed well throughout and made a number of impressive saves.\n" +
                    "\n" +
                    "In the FA Cup semi-final against Southampton, he played an important role in our progress including one great stop when the score was 1-0. \n" +
                    "\n" +
                    "In 2018/19, Caballero appeared nine times behind new first-choice Kepa Arrizabalaga. He notably kept a clean sheet in a crucial home win over Tottenham in February 2019, and he appeared twice in our successful Europa League campaign.\n" +
                    "\n" +
                    "Caballero signed a new one-year contract in the May 2019. \n" +
                    "\n" +
                    "The Argentinean first moved to the Premier League in the summer of 2014, linking up once again with Manuel Pellegrini, whom he had played under at Malaga.\n" +
                    "\n" +
                    "The highlight of his time at City was the 2016 League Cup final when his heroics during the decisive penalty shoot-out against Liverpool ensured City secured the trophy. Caballero saved three penalties - from Lucas, Philippe Coutinho and Adam Lallana - as his team came out on top at Wembley.\n" +
                    "\n" +
                    "In the 2016/17 season he featured in a memorable 3-1 Champions League win over Barcelona, and made a crucial penalty save from former Chelsea striker Falcao in the first leg of their last-16 knockout tie against Monaco.\n" +
                    "\n" +
                    "Caballero featured regularly towards the end of the campaign, including in City's 2-1 defeat at Stamford Bridge. On that night he saved an Eden Hazard penalty, only for the Belgian to tap home the rebound for what proved to be the winning goal.\n" +
                    "\n" +
                    "In Spain he spent seven years at Elche after leaving Boca Juniors. He became their first-choice goalkeeper for a significant period before making the switch to Malaga in 2011.\n" +
                    "\n" +
                    "Malaga, under the guidance of Pellegrini, achieved a sixth-place finish in 2012/13, helped in no small part by Caballero’s form, and at the end of the following campaign he was nominated for the league’s best goalkeeper award alongside Keylor Navas and his future Chelsea team-mate, Thibaut Courtois, who was on loan at Atletico Madrid.\n" +
                    "\n" +
                    "At international level he was part of the Argentina team which won gold at the 2004 Athens Olympics, and later in his career he was named in the Argentina squad for the 2018 World Cup, starting their opening two matches of the competition.",
            "Antonio Rudiger joined Chelsea from Italian side Roma on 9 July 2017. He signed a five-year contract.\n" +
                    "\n" +
                    "A tough tackler, Rudiger is quick on his feet and a commanding presence in the air. Despite having spent most of his career playing in central defence, he is equally comfortable at full-back.\n" +
                    "\n" +
                    "Born in Berlin, Rudiger spent time in the youth set-up at Borussia Dortmund before moving to Stuttgart. He made his Stuttgart debut in a 2012 game against Borussia Monchengladbach at the age of 18, and firmly established himself as a first-team regular during the 2013/14 campaign.\n" +
                    "\n" +
                    "In 2015 he moved to Roma, initially on loan, and after a successful maiden season in Serie A the deal was made permanent and he arrived at Stamford Bridge having acquired European experience in both the Champions League and Europa League.\n" +
                    "\n" +
                    "He featured frequently for Germany at youth international level and made his debut for the senior side in a friendly against Poland in May 2014.\n" +
                    "\n" +
                    "Having been called up to the reigning world champions’ Euro 2016 squad, Rudiger subsequently missed the tournament through injury but he was a key performer in their 2017 Confederations Cup victory in Russia. He was part of the defence which kept a clean sheet in the 1-0 win over Chile in the final.\n" +
                    "\n" +
                    "He came on as a substitute for Chelsea in the Community Shield against Arsenal in August 2017 and made his full debut the following weekend in a home game against Burnley. He continued to be used regularly by Antonio Conte in the first half of the season, both on the left and on the right of a back-three defence.Rudiger scored his first Chelsea goal in a Carabao Cup win over Everton in October 2017 and his first in the Premier League was the only goal of the game when Swansea were defeated at Stamford Bridge the following month (above). Another headed goal followed in a big win over Stoke in the last game of 2017, but the German did have the misfortune of being involved in two deflections that majorly contributed to Arsenal knocking us out of the Carabao Cup at the semi-final stage.\n" +
                    "\n" +
                    "He had better luck in the FA Cup, which ended with a win at Wembley and Rudiger being named the man of the match for a solid showing on the left of the back three. It was a position he made his own for the closing months of a good first campaign at Chelsea. ",
            "Marcos Alonso signed for Chelsea from Fiorentina in August 2016.\n" +
                    "\n" +
                    "The Spanish left-back, who was the first defender recruited by Antonio Conte, penned a five-year contract.Alonso was born in Madrid and is the son and grandson of former Spain internationals. He was a youth and B-team player for Real Madrid, before being handed his one first team appearance there by Manuel Pellegrini in April 2010 as a late substitute in a win against Racing Santander.\n" +
                    "\n" +
                    "That summer he joined Bolton Wanderers as a 19-year-old and was a team-mate of Gary Cahill for one-and-a-half years prior to the England international’s move to Chelsea.\n" +
                    "\n" +
                    "Alonso stayed in the north-west for three seasons, two of those in the Premier League, and made 46 appearances, scoring five goals.\n" +
                    "\n" +
                    "After half a season at Fiorentina, he was recruited on loan for the second half of the 2013/14 campaign by Sunderland manager Gustavo Poyet, who selected the Spaniard in the League Cup final against Manchester City. Alonso also played in the Sunderland win at Stamford Bridge which ended Jose Mourinho’s 77-game undefeated league run at our stadium. It was his volley that led to the visitors equalising that April day.\n" +
                    "\n" +
                    "Alonso then returned to Fiorentina where he established himself as a regular in the team as a left-back, wing-back or in a back-three. He left La Viola having made 85 appearances and scored five goals.\n" +
                    "\n" +
                    "He made his Chelsea debut in a League Cup win at Leicester in September 2016, and flourished the following month as left wing-back when Conte introduced a 3-4-3 system. The team went through October with a 100 per cent league record and no goals conceded and the good form continued into winter. He became the first player in English football league history to win his first 14 starts for one club, an ever-present in the run that did not end until we visited White Hart Lane at the start of 2017.\n" +
                    "\n" +
                    "Alonso scored his first Chelsea goal in a fantastic team performance on Bonfire Night (5 November) 2016 when Everton were swept aside 5-0. He netted two in a win at Leicester in January 2017 and headed the important opener in an equally crucial home win over Arsenal the following month (below). The Spaniard continued to look increasingly strong and assured as the Blues closed in on the league title, and he ably demonstrated he could provide a left-footed free-kick threat with a goal at Bournemouth in the April and strikes against the woodwork. One of our new champions ended the season a clear first-choice in the side with six goals scored and impressive defensive performances too.",
            "A tall, ball-playing centre-back, Andreas Christensen spent eight years at Brondby before joining Chelsea ahead of many other suitors before the 2012/13 campaign. He wasted little time in displaying his composure and assuredness at the heart of defence for our youth team, impressing enough to earn himself an Under-21 debut before Christmas; however it was in the FA Youth Cup where he most grabbed attention.\n" +
                    "\n" +
                    "He scored the first goal in the fourth round at the Valley to inspire a fightback against Charlton after the Under-18s had fallen 2-0 behind, and played in all but two of the ties en route to the final. His total of 11 Under-21 appearances for the season underlined a level of maturity in his play beyond his years, and he made his European debut in the NextGen Series for Under-19s in a defensive midfield role against Ajax in December 2012.\n" +
                    "\n" +
                    "Christensen’s impressive first campaign earned him a spot on the bench for the final game of the season against Everton and, while he didn’t enter the fray to make a senior appearance, he was involved in a post-season tour to the USA.\n" +
                    "\n" +
                    "After signing a professional contract in the summer, he spent 2013/14 working predominantly with Dermot Drummy’s Under-21 group, featuring on 25 occasions as they topped the table and then won the league play-offs. He scored his first Under-21 goal in a 2-1 win over Manchester City in October and started every FA Youth Cup tie from the fifth round onwards as Adi Viveash’s youngsters won a memorable final against Fulham.\n" +
                    "\n" +
                    "Having played throughout the senior squad's pre-season, he was named as a member of Jose Mourinho's squad for the 2014/15 campaign and made his Chelsea debut in our fourth round Capital One Cup victory at Shrewsbury (below), playing the full 90 minutes at right-back and performed a similar role in the FA Cup fourth round against Bradford. Christensen was also part of the Under-19 side which won the UEFA Youth League in April 2015 and he had his first taste of Premier League football as a late sub against Sunderland at the end of the season.It was announced on 10 July 2015 that he would spend a year on loan in Germany, gaining experience with Bundesliga club Borussia Monchengladbach.\n" +
                    "\n" +
                    "In December 2015 Christensen won the 2015 Danish Talent of the Year award, which is given to the most promising Danish talent in their domestic league or abroad, who is under the age of 22 at the time of voting. The youngster was rewarded having established himself as a regular in the Monchengladbach side and earned senior international recognition for Denmark. In February 2016 he scored his first two Bundesliga goals in a big win over a Werder Bremen side featuring another Chelsea loanee, Papy Djilobodji.\n" +
                    "\n" +
                    "He finished a highly successful season in German having made 39 appearances and scored three goals, helping his loan club qualify for the following season’s Champions League with a fourth-place finish in the Bundesliga, having competed in the European competition in 2015/16 with Manchester City, Juventus and Sevilla the opponents in a tough group stage.\n" +
                    "\n" +
                    "In June 2016, Christensen comfortably won a vote of Gladbach supporters to decide their team's Player of the Season and he spent 2016/17 on loan there too. It was a campaign in which the German side failed to match the heights of 2015/16, but the young Dane remained a major player for them and continued to impress both defensively and with his quality on the ball. Christensen gained further Champions League experience in group games against Man City and Barcelona and ended the season having made 43 appearances and scored four goals, two of which came in the Bundesliga and two in the Europa League.\n" +
                    "\n" +
                    "Christensen was part of the squad which travelled to China and Singapore in the summer of 2017 and he came on as a second-half substitute in our first game against Arsenal before starting the second versus Bayern Munich.\n" +
                    "\n" +
                    "Suspension and injury to David Luiz meant that before long he had established himself in the heart of our defence, impressing with his composure and positioning as we racked up plenty of clean sheets in November, December and January.\n" +
                    "\n" +
                    "He continued to be a mainstay of the defence until the final weeks of the season, gaining valuable experience against some of the top teams in England and Europe. His efforts were recognised at the end-of-season awards when he was named Chelsea's Young Player of the Year after a wonderful breakthrough campaign for the Dane. \n" +
                    "\n" +
                    "With David Luiz and Toni Rudiger establishing a central-defensive partnership in new manager Maurizio Sarri's favoured 4-3-3 formation, Christensen's involvement during 2018/19 largely came in the domestic cup competitions, and the Europa League. He was an ever-present (with 15 appearances out of 15) as we lifted that trophy with a big win over Arsenal in the final. Christensen's assured touch and bravery in defence had helped keep out the Gunners. In all competitions he played 29 times for us. ",
            "Signed from Marseille in August 2012, weeks after representing Spain in the London Olympics, Cesar Azpilicueta soon emerged as a first-choice right-back. His ability to suppress opposition wingers immediately impressed, along with his dependability in possession and increasing willingness to join the team’s attacks.\n" +
                    "\n" +
                    "A strong beginning to life at Stamford Bridge earned Azpilicueta – affectionately known as ‘Dave’ by team-mates and supporters alike – a first call-up to the full Spanish national team in early 2013, and he ended his first campaign in Chelsea blue with 48 appearances.\n" +
                    "\n" +
                    "He has since proven capable of playing left-back and as one of a back-three defence, and ended his second season at the club by winning the Chelsea Players' Player of the Year award. He won his first Premier League title in 2015.Born on 28 August 1989 in Pamplona, Navarre, Azpilicueta began his career at the academy of his hometown club, Osasuna. Having come through the ranks in Pamplona, Azpilicueta was handed his La Liga debut on 8 April 2007 against Real Madrid at the Bernabeu.\n" +
                    "\n" +
                    "The following season, with Osasuna depleted by injuries, the youngster featured regularly and cemented his place in the team at right-back with a string of impressive displays, while the 2008/09 campaign saw him miss only two games.\n" +
                    "\n" +
                    "In June 2010, Azpilicueta made the switch from Spain to France, signing a four-year deal with Marseille. The youngster, however, endured a difficult opening to his career at the club suffering a knee injury which ruled him out for his first season.\n" +
                    "\n" +
                    "Following the disappointment of the previous campaign, the 2011/12 season - with both the European Championships and Olympics on the horizon - was always going to be a big one for the young Spaniard. He flourished, performing consistently well and catching the eye as Marseille reached the Champions League quarter-finals, eventually eliminated by beaten finalists Bayern Munich.",
            "Emerson, full name Emerson Palmieri dos Santos, arrived at Stamford Bridge following a fruitful and productive two-and-a-half seasons with Roma, where he established himself as an important member of the side and gained invaluable experience of playing in Europe.\n" +
                    "\n" +
                    "A versatile left-sided player who can operate as a full-back, wing-back or in a more advanced role, Emerson is skilful, possesses a good range of passing and reads the game well.Having been a standout performer for Santos’ Under-20 side, Emerson began to feature for the first team more regularly and he eventually caught the eye of Italian side Palermo, who signed the youngster on a season-long loan ahead of the 2014/15 campaign.\n" +
                    "\n" +
                    "Emerson then moved to Roma, again on a season-long loan, a year later and scored his first goal for the club at the San Siro in a 3-1 win over AC Milan. He joined Roma on a permanent basis in December 2016.\n" +
                    "\n" +
                    "During the 2016/17 season, as a team-mate of Toni Rudiger, he started regularly for Roma and performed well over the course of the campaign as they finished second in Serie A, just four points behind champions Juventus.\n" +
                    "\n" +
                    "Injury ruled him out of the start of the 2017/18 campaign but he returned in the December and completed his move to Chelsea a month later, making his debut for the Blues in our 4-0 FA Cup win over Hull City when he impressed at left wing-back and laid on a goal for Olivier Giroud.\n" +
                    "\n" +
                    "He got his chance to play in the Premier League when Marcos Alonso was suspended for three games, impressing in away wins at Burnley and Swansea. Between those matches he didn't look out of place in the FA Cup semi-final against Southampton at Wembley, although injury denied him a chance to be involved in the final the following month. ",
            "Kurt Zouma signed for Chelsea from St-Etienne on the final day of the January 2014 transfer window but remained on loan at the French club for the rest of the season.\n" +
                    "\n" +
                    "While the centre of defence is where he has most frequently appeared, Zouma can also play right-back or as a deep midfielder.\n" +
                    "\n" +
                    "He enjoyed a memorable debut for the Blues when he opened the scoring in a 2-1 Capital One Cup win over Bolton Wanderers and ended that quest for silverware playing midfield in the win over Tottenham in the final. A first Premier League title soon followed but unfortunately Zouma's second season was curtailed by a lengthy injury.\n" +
                    "\n" +
                    "He made his first team return in January 2017 as we won a second league title since his arrival at the club.\n" +
                    "\n" +
                    "In July 2017, Zouma signed a new six-year contract at Stamford Bridge and joined fellow Premier League side Stoke City on loan for the season. He stood out despite the Potters' struggles, playing 35 of their Premier League games and earning man-of-the-match awards for his performances against Arsenal at home and Liverpool away.\n" +
                    "\n" +
                    "Zouma spent 2018/19 on loan at Everton where he again impressed, playing 36 times and scoring twice. He then returned to Stamford Bridge for pre-season under Frank Lampard. ",
            "Reece James is a graduate of our development centre programme and has been training with us since the age of six. He started out mostly as a striker before moving further back into midfield and defence. A right-footed player, he made his youth team debut while still a schoolboy in 2015/16 before becoming a key figure in our Treble-winning Under-18 season the following year.\n" +
                    "\n" +
                    "His versatility was a key attribute as he featured at right-back, wing-back and in a central defensive back three throughout the campaign, playing in every game as the Youth Cup was successfully retained and scoring a brilliant header in the semi-final at White Hart Lane.\n" +
                    "\n" +
                    "In March 2017, James signed a first professional contract at the club which ran until the end of the 2018/19 campaign, before helping England to triumph at the Toulon Tournament in the summer. There he impressed to such an extent he was named in the team of the competition.\n" +
                    "\n" +
                    "He continued his good form in 2017/18, captaining the Under-18s to another FA Youth Cup triumph and being named Academy Player of the Season. \n" +
                    "\n" +
                    "In June 2018, he signed a four-year Chelsea contract and went on loan to Wigan Athletic in the Championship for the forthcoming season. \n" +
                    "\n" +
                    "There he was a huge success. He was instrumental in helping Wigan stay in the Championship and received an astonishing 96 per cent of the votes from Latics supporters in their Player of the Year vote.\n" +
                    "\n" +
                    "He played at right-back and central midfield and was also voted Wigan’s Players’ Player of the Year. To top it off he won the club’s Goal of the Season award for a brilliant hit away to Bristol City.\n" +
                    "\n" +
                    "James suffered an ankle injury on international duty over the summer, so had to wait until late September before making his Blues bow. He marked the occasion with a goal, too, superbly curling a 20-yarder in against Grimsby in a big Carabao Cup win. \n" +
                    "\n" +
                    "A week later his started in the Champions League as we defeated Lille in France, showing no signs of nerves on such a big stage. \n" +
                    "\n" +
                    "The landmarks kept coming. He made his Premier League off the bench against Newcastle, and his first start in the competition as we beat Crystal Palace 2-0, with James earning plaudits for the manner in which he kept Wilfried Zaha quiet. Between those two games he scored a dramatic equaliser against Ajax, capping an incredible comeback from 4-1 down and sparking delirium inside the Bridge. ",
            "Fikayo Tomori joined the club as an Under-8 and has played predominantly on the right side of central defence or at right-back through the age groups. He made his youth team debut while still an Under-16 before going on to feature as a regular for Joe Edwards’s side in his first season as a scholar.\n" +
                    "\n" +
                    "He started every game as the Under-18s successfully defended the Youth Cup and featured in eight of the 10 UEFA Youth League matches on the way to victory in Switzerland. His strong performances at the back also earned him an Under-21 debut and he made half a dozen appearances for Adi Viveash’s side before the end of the season.\n" +
                    "\n" +
                    "He was an Under-21 regular in 2015/16 while also developing a goalscoring knack, with goals in the final of both the Youth Cup and UEFA Youth League. Fikayo made his first team debut as a substitute on the final day of the campaign against Leicester City and was named the Academy Player of the Year at club's annual awards.\n" +
                    "\n" +
                    "Tomori signed a new contract in August 2016, which commits him to Chelsea until the end of the 2019/20 season, before making his England Under-20 debut the following month. Having played for the development squad for the first half of the 2016/17 season, it was announced in the January that he would spend the second half of the campaign on loan in the Championship at high-flying Brighton.\n" +
                    "\n" +
                    "Tomori made his debut in an FA Cup match against Lincoln and recovered from scoring an own-goal to begin to feature more frequently throughout February and March, including in big games against Reading, Newcastle and Leeds. By the end of the season he had made three starts and seven sub appearances in all competitions for the south coast club, who won promotion to Premier League as Championship runners-up.\n" +
                    "\n" +
                    "There was major success too in the summer of 2017 when playing in central defence alongside Chelsea colleague Jake Clarke-Salter, Tomori was a mainstay of the England side that won the Under-20 World Cup held in South Korea. He was involved in an unfortunate long-range own-goal early in the tournament but it did not dent his confidence and clean sheets were kept in the quarter-final against Mexico and final against Venezuela.\n" +
                    "\n" +
                    "Tomori came on for Victor Moses in the first game of our Asian tour in 2017 and played at right wing-back. He was on the bench at the start of the season before switching to Hull for a loan on transfer deadline day. He played 26 times on Humberside and filled in across a back four which often contained Chelsea colleagues Ola Aina and Michael Hector. \n" +
                    "\n" +
                    "In August 2018 it was announced he would be spending another season on loan in the Championship, at Derby County under the management of Frank Lampard and Jody Morris. It was a profitable year there to say the least. Tomori was a fixture in the side, making 55 appearances and scoring twice as the Rams made it all the way to the Championship play-off final at Wembley. He was voted Derby's Player of the Year. \n" +
                    "\n" +
                    "He played for England Under-21s at the European Championships in the summer of 2019, and under the returning Lampard and Morris was made a part of the senior squad at Chelsea. He came on during the Super Cup loss in Istanbul and then made his full debut for the Blues in a 2-2 draw against Sheffield United at the Bridge, looking composed throughout. ",
            "Jorginho completed his move from Napoli to Chelsea in July 2018 and finished his first season a Stamford Bridge a Europa League winner. \n" +
                    "\n" +
                    "The Italian international is a highly technical midfielder capable of dictating the tempo of play in possession with quick passing and movement. He has most often been deployed as a deep-lying playmaker in a midfield three, using his ability to link defence and attack. \n" +
                    "\n" +
                    "Alongside his technical qualities, he is a combative player willing to put his foot in to regain possession, and his positioning without the ball further aids his effectiveness in front of the defence.\n" +
                    "\n" +
                    "He was a near ever-present in his first season in England, playing 54 times for Maurizio Sarri's Chelsea and starting all but one of our league matches. \n" +
                    "\n" +
                    "Jorginho scored on his Premier League debut, converting from the penalty spot in our 3-0 win at Huddersfield. His first goal from open play was a stunning edge-of-the-box strike away to Fulham in March. \n" +
                    "\n" +
                    "It was a good answer to some critics who had circled followed our disappointing away form and defending earlier in 2019, but Jorginho quickly displayed his mettle by playing the best football of his Chelsea career yet as the 2018/19 campaign drew to a close. \n" +
                    "\n" +
                    "He bounced back from missing a penalty in the Carabao Cup final (having scored in the successful semi-final shoot-out against Spurs) to convert from 12 yards against Eintracht Frankfurt as we booked our place in Baku, where Jorginho produced arguably his best Chelsea performance yet to help us dominate against Arsenal. \n" +
                    "\n" +
                    "He continued that form into the following season under the new management of Frank Lampard, with the boss deciding his experience and leadership skills merited the vice-captaincy. ",
            "N'Golo Kante was a major addition to the squad for the 2016/17 season, signing a five-year contract for Chelsea.\n" +
                    "\n" +
                    "Kante joined from Leicester City, where he so memorably played a major part in the Foxes’ Premier League triumph the previous season. The then 25-year-old came close to adding to that success on the international stage soon after. He was part of the France squad that was denied a host-team triumph at Euro 2016 by an extra-time Portugal goal in the final.\n" +
                    "\n" +
                    "He arrived at Chelsea with a Premier League winners’ medal and eight international caps to his name, and was selected for the first game of the 2015/16 season, a win at home to West Ham.\n" +
                    "\n" +
                    "Picking up where he had left off at Leicester, Kante was a mainstay of Antonio Conte's team in the first half of the campaign, memorably scoring the fourth and final goal in a big win over Manchester United in October 2016.\n" +
                    "\n" +
                    "A match that typified his energy and contribution was an away draw at Anfield in January 2017 when he won a remarkable 14 tackles out of the 16 he went in for. The next best player that night won three.He scored again against Manchester United at Stamford Bridge, this time netting the only goal of the game in an FA Cup quarter-final in March, and followed that up a month later by being named PFA Player of the Year, as voted by his fellow professionals. It was widely acclaimed throughout the game as a thoroughly deserved honour and another one followed soon after when he was named 2017 Footballer of the Year by the Football Writers' Association, becoming the 18th player in history to win both awards in the same season.\n" +
                    "\n" +
                    "Most importantly, he started 35 of the 38 games that recaptured the Premier League title for Chelsea. He is the first player to win successive Premier League titles with two different clubs.\n" +
                    "\n" +
                    "He scored what proved to be the winner at his former club near the start of the 2017/18 season and his importance was only emphasised when he missed a month in autumn with an injury suffered on international duty.\n" +
                    "\n" +
                    "On his return and after some struggles, he helped the team achieve an impressive home win over Manchester United.Kante's performances in the second half of the season remained at a high level even when the team occasionally struggled around him. He was one of our star men in both legs of the Champions League last 16 tie against Barcelona, especially impressing in Camp Nou, and played a key role as we reached the FA Cup final. \n" +
                    "\n" +
                    "Before the Wembley showpiece, Kante's performances during 2017/18 were recognised by the Chelsea supporters who voted him their Player of the Year. He then ended the season in the best possible fashion, shining in midfield yet again as we shut out Man United to secure the FA Cup, the first of Kante's career. ",
            "Barkley arrived with a wealth of experience for a player so young, having already made 150 Premier League appearances for Everton, as well as being named in England squads for both the World Cup and European Championships.\n" +
                    "\n" +
                    "His versatility ensures he can play just behind the striker, in a deeper midfield role or in an advanced wide position, with his ability to get on the ball and create chances one of the player’s biggest strengths.\n" +
                    "\n" +
                    "Barkley joined Everton at the age of 11 and quickly caught the eye due to his strength, desire and outstanding technical qualities.\n" +
                    "\n" +
                    "His Everton debut arrived on the opening day of the 2011/12 campaign and early on in his career he also spent time on loan at Sheffield Wednesday and Leeds United.\n" +
                    "\n" +
                    "Barkley scored his first Everton goal on the opening day of the 2013/14 season and after being given a key role in the Toffees’ midfield, the consistency and quality of his displays ensured he was named in the England squad for the World Cup in Brazil that summer.Last season, Barkley was a regular in the Everton midfield and created more goalscoring opportunities for team-mates than any other English player in the Premier League, as well as chipping in with six goals of his own.\n" +
                    "\n" +
                    "After signing for Chelsea, Barkley made his debut when he came on for the injured Willian in the first half of our League Cup semi-final second leg against Arsenal. The midfielder was then handed his first start for the club in a home game against Bournemouth. Injury then ruled him out for almost three months, but he was back in the matchday squad before the end of the season and looked lively in the hour he played in our final league game at Newcastle. After a solid pre-season, Barkley started our opening-day win at Huddersfield on the left-hand side of a new-look midfield, with Jorginho playing deep and N'Golo Kante further forward on the right.\n" +
                    "\n" +
                    "Over the early part of the campaign it was one of either Barkley or Mateo Kovacic selected to play alongside Jorginho and Kante and the former Everton man impressed when called upon, with the quality of his performances earning him an England recall.\n" +
                    "\n" +
                    "After scoring his first Chelsea goal in a 3-0 win at Southampton, having also teed up Eden Hazard for the opener, Barkley then fired home a dramatic late equaliser in a 2-2 draw against Manchester United.\n" +
                    "\n" +
                    "A week later, at Burnley, he supplied a superb pass from which Alvaro Morata broke the deadlock and scored the second of our four goals on the day with a wonderful left-footed drive from distance.\n" +
                    "\n" +
                    "Barkley continued to feature regularly in midfield and helped us reach the finals of the Carabao Cup and the Europa League, scoring a penalty in the successful semi-final shoot-out against Eintracht Frankfurt in the latter competition. He didn't start the final in Baku but came on for Kovacic to secure the second winners' medal of his Chelsea career. ",
            "Mateo Kovacic completed a permanent move to Chelsea in July 2019 following a successful season on loan at Stamford Bridge.  \n" +
                    "\n" +
                    "The Croatian international has plenty of experience having featured regularly in Serie A (with Inter Milan), La Liga (Real Madrid), the Champions League and at international level. He played five games during Croatia’s run to the World Cup final in 2018 before heading on loan to Chelsea. \n" +
                    "\n" +
                    "Kovacic is a ball-playing central midfielder who thrives on quick combinations. He combines hard work with skill in possession and penetrative passing. He can also play anywhere across the midfield.Kovacic made his Blues debut when he came off the bench in an early-season win over Arsenal, the Croatian impressing with his clever use of the ball and technical qualities, before making his first start in our next match away at Newcastle. He quickly became an important member of the three-man midfield favoured by Maurizio Sarri, playing on the left of the trio.\n" +
                    "\n" +
                    "Kovacic's link-up with Eden Hazard caught the eye and he supplied a fine pass to the Belgian to open the scoring against Liverpool in September. He also set up Hazard's 100th Chelsea goal at Watford on Boxing Day. \n" +
                    "\n" +
                    "The 25-year-old contributed significantly to our Europa League-winning campaign, starting in 10 of the 15 games, including the final in Baku, and making two further substitute appearances. He was a standout performer against Arsenal in Azerbaijan and was involved in three of the goals in our 4-1 win.Kovacic enjoyed the best form of his Chelsea career to date during the first half of his second season at the club. A regular under Frank Lampard, his combination play with Jorginho proved particularly effective, as did his driving runs from midfield that showcased his dribbling ability. \n" +
                    "\n" +
                    "He also had the satisfaction of scoring his first goal for us - and his first in nearly three years - as he equalised away to Valencia with a precise 20-yarder. A second goal soon followed in a league loss at Everton. ",
            "He has always been an attacking midfielder, capable of playing in any of the central midfield roles and is particularly strong at going from box-to-box.\n" +
                    "\n" +
                    "He played seven times for our Under-18s in 2014/15 when still a schoolboy and, despite picking up an injury on the first day of pre-season training, Mount's debut campaign as a scholar was a positive one.\n" +
                    "\n" +
                    "He netted in our 5-1 win at Manchester United in the FA Youth Cup and played a pivotal role as a substitute in both the semi-final and final of our triumphant UEFA Youth League defence in April, setting up two goals in the 3-0 last-four win over Anderlecht. Later in the week, he scored a crucial goal in the first leg of the Youth Cup final away at Manchester City as we successfully defended the trophy.\n" +
                    "\n" +
                    "2016/17 saw Mount establish himself as a regular with the development squad, scoring his first goal at that level against Liverpool in August. He also captained the Youth Cup side to a fourth consecutive success, netting a hat-trick in our fourth-round win at Birmingham. The midfielder's eye-catching displays earned him plenty of admirers and he rounded off an impressive campaign by setting up the winner in the final as England won the Under-19 European Championship.\n" +
                    "\n" +
                    "He moved to Vitesse Arnhem on loan for the 2017/18 season and enjoyed a year to remember in Holland. His 14 goals were integral in helping Vitesse qualify for the Europa League, and he featured impressively in that competition early in the campaign, too. Deployed either in central midfield or a no.10 role, Mount's creativity and finishing ability stood out to such an extent he was named Vitesse's Player of the Year. He finished the season by training with the England senior squad ahead of the World Cup. \n" +
                    "\n" +
                    "In July 2018, he moved on loan to Championship side Derby County, managed by Frank Lampard and his former youth team boss Jody Morris. The midfielder was an integral part of the way Lampard’s Derby played, pressing from the front with intelligence and industry, while also demonstrating guile and quality on the ball. He only turned 20 midway through the season but finished with 16 goals and assists combined as the Rams fell 90 minutes short of promotion to the Premier League. Tellingly, his injury absence through February and March coincided with Derby winning just two of 10 matches.\n" +
                    "\n" +
                    "After going to the Under-21 European Championships with England in the summer of 2019, Mount returned to Chelsea and signed a new five-year contract.\n" +
                    "\n" +
                    "He started the season in the team under Lampard, making his Chelsea debut and impressing against Man United despite an eventual heavy defeat. He marked his first appearance at the Bridge by opening the scoring early on, and he followed that maiden strike up with another away to Norwich the following weekend.Mount scored his third Chelsea goal in four games late on in our big 5-2 win at Wolves, capping a fine few days in which he had also made his senior England debut at Wembley. ",
            "A talented two-footed winger, who is also capable of playing more centrally, Pedro arrived at Stamford Bridge with a fantastic pedigree having already enjoyed success at the highest level at club and international level, which he added to as a Blues player.\n" +
                    "\n" +
                    "He made his Chelsea debut away at West Bromwich Albion in August 2015 and endeared himself to supporters immediately, scoring one and laying on another in a 3-2 victory. He scored his first Premier League goal at home to Sunderland in December 2015, the first game after the departure of Jose Mourinho as manager.\n" +
                    "\n" +
                    "Pedro found good form in the latter months of the season despite some niggling injuries, and recorded two-goal hauls at home to Newcastle and away to Aston Villa, followed by a fine opener in a big win at Bournemouth. He finished joint-third highest scorer with eight goals from the 40 appearances of his maiden season.\n" +
                    "\n" +
                    "In October 2016, early in his second season at Chelsea, he scored the fastest goal of that campaign so far when netting after 30 seconds of a 4-0 win over Manchester United. It was also his 50th Chelsea appearance and began a run of scoring form which included the Premier League's Goal of the Month for November 2016, a turn and spectacular curled finish that equalised in a win at home to Spurs.\n" +
                    "\n" +
                    "Pedro's best form since arriving at the club frequently won him selection ahead of the previous season's Player of the Year Willian, and in the FA Cup, as a left wing-back and a right wing-back. He found the target five times in six games at the turn of the year.The Spaniard then won his second Goal of the Month award for a truly stunning strike in a 3-0 win away at Everton (above), a result which sparked jubilant celebrations at the final whistle as the Blues closed in on the title, and he was on target again in our final-day thumping of Sunderland as he came off the bench to head home. In total, he scored nine league goals en route to picking up his first trophy in England.\n" +
                    "\n" +
                    "Early in the pre-season tour of 2017, Pedro had to return home having suffered fractures in his face due a collision in a game against Arsenal in Beijing, but he was soon back to fitness and back among the goals, scoring fine strikes against Stoke and Watford.Pedro's season didn't hit the same heights as the one before, as a switch in formation to 3-5-2 meant he was often forced to try and make an impact off the bench. He did score twice in our run to glory in the FA Cup, though, most crucially heading the winner during extra-time of a tight quarter-final tie at Leicester. He also filled in at times in central midfield, most impressively in a fine victory against Burnley in April which he lit up with some dazzling skill. \n" +
                    "\n" +
                    "He finished 2017/18 with seven goals in 48 appearances in all competitions. Ahead of the 2018/19 campaign Pedro signed a one-year contract extension and after an impressive pre-season campaign he scored three goals in our first four matches, including the opener in a 3-2 win over Arsenal.\n" +
                    "\n" +
                    "Three more Premier League strikes followed before Christmas as we battled to earn a top-four place, which we eventually secured in no small part due to his crucial and silky opening goal at home to Tottenham in February following a wobbly period for the Blues. \n" +
                    "\n" +
                    "He scored twice at home to Slavia Prague in the Europa League quarter-finals, and arguably his most important strike of the season followed in the semi-final first leg away to Eintracht Frankfurt, when a typically precise finish brought us level shortly before the break in what proved to be a tight tie. Pedro was at it again in the final in Baku, converting our second goal on his left foot and finishing the season a Europa League winner for the first time in his illustrious career.  ",
            "Callum Hudson-Odoi is an attacking player who joined the club during his Under-8 year and has regularly been a scorer and creator of goals throughout his schoolboy years. He is a very talented, skilful individual who can play in any of the attacking positions.\n" +
                    "\n" +
                    "A regular with our youth team in the 2016/17 season, he played a key role in our Treble-winning success at that level that year, including goals in the fifth round, semi-final and final of the FA Youth Cup. Although still a schoolboy, he represented England Under-17s at the 2017 European Championship for that age group, scoring in the final as the young Lions were ultimately beaten on penalties by Spain.\n" +
                    "\n" +
                    "Later in the year, he featured at the Under-17 World Cup as England inflicted revenge by going all the way and beating Spain 5-2 in the final. Hudson-Odoi featured in every game at the tournament and assisted three goals against the Spanish to add another medal to his 2017 collection.\n" +
                    "\n" +
                    "In January 2018, he made his senior Chelsea debut when he came on in an FA Cup win over Newcastle United, and he made a further three sub appearances that season, including his first in the Premier League in a home match against Bournemouth. He also helped our development squad to the semi-finals of the Checkatrade Trophy and the Under-18s to another FA Youth Cup. He scored twice in the final.\n" +
                    "\n" +
                    "Having impressed during pre-season in the summer of 2018, including starting the Community Shield against Manchester City, it was confirmed the teenager would be part of the senior squad for 2018/19. \n" +
                    "\n" +
                    "After a couple of substitute appearances in the Europa League, he then started the game against PAOK Salonika and capped an impressive performance by scoring his first Chelsea goal in the second half.Hudson-Odoi began to feature more regularly early in 2019 and assisted both goals for Alvaro Morata in an FA Cup win over Nottingham Forest, before starting the first leg of our Carabao Cup semi-final against Tottenham, when he performed well and struck the post in the first half.\n" +
                    "\n" +
                    "He scored further goals against Sheffield Wednesday in the FA Cup, and Malmo and Dinamo Kiev in the Europa League, before making history by becoming Chelsea's youngest-ever England international at just 18. He was brought off the bench for the final 20 minutes of the Three Lions' big Euro 2020 qualification win against Czech Republic at Wembley, having a hand in the fifth goal of the night. He the started for England a few days later in Montenegro, registering an assist for his Chelsea team-mate Ross Barkley. \n" +
                    "\n" +
                    "He started four consecutive Premier League games in April and impressed before an Achilles injury brought a season full of promise to an unfortunately premature end. He finished the season with 24 Chelsea appearances and five goals to his name. \n" +
                    "\n" +
                    "On 19 September, Hudson-Odoi committed his future to Chelsea by signing a new five-year contract. \n" +
                    "\n" +
                    "A week later came his long-awaited return to action, which he marked with a goal in a big Carabao Cup victory over Grimsby. He either started or came off the bench in our next 10 games in all competitions, proof of a smooth comeback after so long out for such a young man. ",
            "The striker arrived with a proven pedigree at the highest level having scored goals regularly in the Premier League, in Europe and on the international stage for France.\n" +
                    "\n" +
                    "A strong, physical forward, Giroud is lethal in the air and clinical with his feet in and around the penalty area. He played an important role in our recent successes in the FA Cup (2018) and the Europa League (2019), scoring against his former club in the final of the latter competition in Baku. \n" +
                    "\n" +
                    "Giroud began his career with Grenoble and, after moving up through the ranks, eventually made his first-team debut for the French club in 2006.\n" +
                    "\n" +
                    "A loan spell at Istres followed before he joined Ligue 2 club Tours on a permanent basis. So impressive were his displays for Tours, Giroud then moved to Montpellier, in the French top flight, in July 2010.\n" +
                    "\n" +
                    "The striker made a goalscoring debut for Montpellier and enjoyed a solid first season with the club, scoring both goals in a 2-2 draw at PSG, as well as netting the winner against the same opposition in a League Cup semi-final.\n" +
                    "\n" +
                    "His second campaign at the club really could not have gone any better, with the forward netting hat-tricks in matches against Dijon and Sochaux as well as the winning goals against Lyon, Nice and St-Etienne as Montpellier won the French title for the first time in their history. He ended the campaign with 21 league goals.\n" +
                    "\n" +
                    "After signing for Arsenal in the summer of 2012, Giroud quickly adapted to the demands of English football. He ended the 2013/14 and 2014/15 seasons by playing in victorious FA Cup finals and in the second of those – a 4-0 win over Aston Villa – it was Giroud who completed the scoring.Having made his Chelsea debut in an away game at Watford, Giroud impressed on his first start at home to West Bromwich Albion and scored his maiden goal for the club in our following game, a 4-0 FA Cup win over Hull City.\n" +
                    "\n" +
                    "Giroud had to wait a while for his first league goals in Chelsea blue, but when they arrived they swung an away game at Southampton decisively in our favour as we fought back from 2-0 down. He scored another goal against the same opposition at Wembley a week later, setting us on our way to victory in the FA Cup semi-final with a slalom individual goal. \n" +
                    "\n" +
                    "He headed a fine winning goal against Liverpool in May and finished the season as first-choice striker, working hard in our FA Cup final win over Man United which earned him a fourth winners' medal in the competition. Due to his involvement in the later stages of the 2018 World Cup, Giroud arrived back for pre-season training later than most, meaning his start to the season was naturally slow in terms of involvement.\n" +
                    "\n" +
                    "His first goal of the season, a well-taken header, proved decisive away against BATE Borisov in the Europa League, and that was followed by a brilliant brace in a 4-0 win over PAOK at the Bridge. In December, Giroud then rescued a point with a stunning last-gasp free-kick as we drew 2-2 against MOL Vidi.\n" +
                    "\n" +
                    "He had truly made the Europa League his competition and finished as the topscorer with 11 goals, the last of which was the crucial opener against his former club Arsenal in the Baku final. It was typical Giroud - a magnificent and improbable header from an awkward angle that flew into the net and broke the deadlock. \n" +
                    "\n" +
                    "Earlier in the knockout stage he scored home and away against Malmo and followed that up with a perfect hat-trick away to Dynamo Kiev in the last 16. He also scored against Slavia Prague in the victorious quarter-final, so there was nobody more deserving of a winners' medal than him in Azerbaijan. ",
            "The purchase of Willian was completed in late August 2013, the Brazilian signing a five-year contract on moving to England from Russian club Anzhi Makhachka\n" +
                    "\n" +
                    "Chelsea fans knew what they were getting when the Blues brought Willian to the club, having seen him net twice in a virtuoso display for Shakhtar Donetsk at the Bridge in 2012.\n" +
                    "\n" +
                    "His choice of Stamford Bridge, and not White Hart Lane, as had been expected, immediately endeared the likeable Brazilian to the club’s supporters, who had a song penned for him even before he made his debut for the club.\n" +
                    "\n" +
                    "Comfortable operating in any of the attacking midfield positions behind the main striker, Willian is quick, robust and creative in possession. As his first couple of Chelsea goals proved, he also has an eye for the spectacular and he has emerged as one of the game's best set-piece specialists.\n" +
                    "\n" +
                    "His direct free-kicks were a major feature of the 2015/16 season when he shone brightly in a gloomy campaign in general. It was no surprise when Willian was both the fans and his team-mates' choice for Chelsea Player of the Year.Born on 9 August 1988, in Ribeirao Pires, Willian Borges da Silva played at Sao Paulo before moving to Corinthians at the age of nine.Having made his way through the Brazilian club's academy, Willian rose to prominence in 2005 at the prestigious Copa Sao Paulo de Futebol Junior tournament, which he won with Corinthians before being promoted to the first team shortly after.Having impressed potential suitors with his performances, Willian's stock continued to rise, culminating in a move to Ukrainian side Shakhtar Donetsk in August 2007.Possessing trademark Brazilian skills, and with the guile and creativity to unlock tight defences, during his time at Shakhtar Willian won four league titles, three Ukrainian Cups, three Ukrainian Super Cups and, most memorably, the 2009 UEFA Cup, which was clinched with a 2-1 over Werder Bremen.Chelsea supporters will be familiar with the player after he scored twice at Stamford Bridge when we beat Shakhtar 3-2 in the group stages of the 2012/13 Champions League. He also impressed during our 2-1 defeat in the away game.Willian spent six years at Shakhtar before completing a switch to Anzhi in January 2013.Willian made his Chelsea debut in a Champions League home game against Basel in September 2013 and scored his first goal for the Blues the following month in a 3-1 win at Norwich City, bending in a sumptuous long-range effort with his left foot. It was nominated for the club’s Goal of the Season award.\n" +
                    "\n" +
                    "Following a relatively quiet start to his Chelsea career, the Brazilian soon began to acclimatise to the pace and power of English football, emerging as a key member of the team that flourished so impressively over the Christmas and new year period.\n" +
                    "\n" +
                    "He capped some fine individual performances towards the end of 2013 with his second goal for the club on the first day of 2014, another delightful strike from outside the box, this time in a 3-0 success at Southampton.\n" +
                    "\n" +
                    "Throughout the second half of the campaign he continued to impress with his industry and skill, with further goals coming in wins against Stoke City and Liverpool. At the season’s end he earned a call-up to Luiz Felipe Scolari’s Brazil World Cup squad, testament to his good form at club level.Willian was regular in the side during a hugely successful campaign, playing as one of three attacking midfielders behind a single striker. His tenacity with and without the ball was evident throughout as his interchanges with the likes of Oscar, Eden Hazard and Cesc Fabregas flourished.Willian scored his first goal of the season against Aston Villa and by the midway point of the season he had followed that up with strikes against Schalke in the Champions League and Watford in the FA Cup, but his most important came in February 2015 when he hammered home an 89th-minute winner against Everton (above) to keep the Blues on course for the league title. He played 36 Premier League games overall.\n" +
                    "\n" +
                    "It was Willian's free-kick that lead to John Terry's opening goal as Chelsea also won the Capital One Cup by beating Spurs.As the Blues endured a difficult start to the title defence that ultimately cost Jose Mourinho his job as manager, Willian was one of the players who maintained his form from the previous year. Indeed he added a new potent string to his bow as he became the most dangerous free-kick taker in the country. His first six goals of the season, all netted before November, were from direct free-kicks, and he followed those up with some memorable strikes in open play, not least when he found the top corner in a heartening win at Crystal Palace at the turn of the year.\n" +
                    "\n" +
                    "One of Willian's free-kick goals was during his 100th Chelsea game, away to Porto, and he was the joint-highest appearance maker in 2015/16 and second topscorer with 11 goals. At the campaign's end he collected the club's Player of the Year and Players' Player of the Year awards.Willian signed a new four-year contract in July 2016 and hit the net in the second home game of the campaign, a win against Burnley. A more signifcant goal was a fine strike away at Hull at the beginning of October that heralded the team's return to form after a couple of defeats and disappointing performances in big games.\n" +
                    "\n" +
                    "However for the Brazilian there was a break in his season following the passing of his mother, and Pedro was frequently the player selected with Diego Costa and Eden Hazard in the front three in the 13-game winning league run that completed the calendar year, but Willian came off the bench to put the team ahead in an important win at Man City, and he shone and scored twice in a New Year's Eve success over Stoke.\n" +
                    "\n" +
                    "Prior to then he made his 100th Premier League appearance in a match at home to Liverpool in September 2016 and his 150th for Chelsea in all competitions at home to Spurs.\n" +
                    "\n" +
                    "Towards the end of the campaign Willian scored twice, including a brilliant free-kick, in our FA Cup semi-final win over Tottenham, and came off the bench to put the seal on a very important away victory at Everton in the run-in to winning the Premier League.\n" +
                    "\n" +
                    "Despite less playing time than previous years, his goal tally of 12 for the season was his best.No player featured more often for Chelsea than Willian, who played in 56 of our 59 games, though he will have wanted to have started more frequently - the switch to a 3-5-2 formation meant he was often reduced to a place on the bench. \n" +
                    "\n" +
                    "Despite this he netted 13 goals, his best return in Chelsea blue. He was especially electric during a purple patch in February and March, when he struck five times in five matches. Among those goals was a deserved effort against Barcelona - when he had already been denied twice by the woodwork - and a powerful finish at Old Trafford. \n" +
                    "\n" +
                    "Earlier in 2018, in a big win at Brighton, he emphatically finished off a flowing Chelsea move to net what would be named our Goal of the Season. By picking up that prize, he followed in the footsteps of his compatriots Oscar, Ramires and Juliano Belletti. Willian's first goal of the season was a superb curling effort which put the seal on a 4-1 win over Cardiff, and a few days later he netted the only goal of the game as we beat PAOK in the Europa League, an evening when he captained Chelsea for the first time. \n" +
                    "\n" +
                    "The Brazilian is no stranger to top-quality strikes, and he was at it again in games against Burnley and MOL Vidi, before he fired home a brilliant winner at home to Newcastle in January.\n" +
                    "\n" +
                    "Willian was regularly rotated with Pedro and towards the end of the campaign Callum Hudson-Odoi, but he still clocked up 56 appearances in all competitions. He featured in every Europa League game as we won the tournament for the first time since his arrival at Stamford Bridge.Under the management of his former team-mate Frank Lampard, Willian has produced some of the best form of his Chelsea career. Leading by example to the multitude of younger players now around him in the team, he has been a regular on the right side of the attack, and stepped up in Eden Hazard's absence to serve as the team's lead creator. His individual highlight in the first half of the season was undoubtedly his brace at Tottenham shortly before Christmas, goals which secured us a famous away win in our first game at their new stadium. ",
            "Michy Batshuayi completed his transfer to Chelsea from Marseille on 3 July 2016 and signed a five-year contract.\n" +
                    "\n" +
                    "A powerful, fast striker, the highly coveted Batshuayi moved to Stamford Bridge having developed a reputation as a fine finisher following spells in France and Belgium. Skilful and with the ability to beat opposing defenders with his quick feet, he is a threat in the air and also comfortable holding the ball up and linking the play.\n" +
                    "\n" +
                    "He was part of the Belgium squad at Euro 2016 and netted with his first touch on his tournament debut, converting a cross from his new Chelsea team-mate Eden Hazard in a 4-0 win over Hungary.\n" +
                    "\n" +
                    "Batshuayi said after signing for the Blues: ‘I am delighted to sign for one of the biggest clubs in Europe and embark on the next chapter in my career. I hope I can help Chelsea win many trophies during my time at Stamford Bridge.\n" +
                    "\n" +
                    "‘Eden Hazard and Thibaut Courtois have told me many good things about the club, and with Antonio Conte coming in it's an exciting time to become a Chelsea player.\n" +
                    "\n" +
                    "‘This is a fantastic opportunity for myself and my family, I am looking forward to playing in the Premier League next season.’\n" +
                    "\n" +
                    "In his initial months at Chelsea he was used mostly from the bench and in our first game of the season, at home to West Ham United, Batshuayi was introduced with the scores level at 1-1 and set up the winning goal for Diego Costa with a smart header in the 89th minute.\n" +
                    "\n" +
                    "Five days later and again a substitute, Batshuayi scored the first of our two goals as we came from behind to win at Watford, opening his Chelsea account from close range after Eden Hazard’s strike had been parried into his path. Three days later he scored twice on his full debut in our League Cup win over Bristol Rovers at Stamford Bridge.\n" +
                    "\n" +
                    "Antonio Conte explained the young striker needed to learn about the requirments of Premier League football so chose to play Eden Hazard at the centre of the attack when Diego Costa was unavailable in that competition, but Batshuayi was handed FA Cup starts in early 2017 and responded with goals and assists.\n" +
                    "\n" +
                    "Without question, the highlight of his maiden season at the club came when Batshuayi scored the goal which clinched the Premier League title away at West Bromwich Albion in May. The Belgian had only been on the pitch a matter of minutes when Cesar Azpilicueta fizzed the ball across the face of goal, with the striker sliding in to divert it home and write his name into Chelsea history.\n" +
                    "\n" +
                    "The campaign finished positively for Batshuayi who then scored in our 4-3 win over Watford, before netting a brace on the final day of the season as we beat Sunderland 5-1.\n" +
                    "\n" +
                    "His knack of grabbing important goals despite not being a regular choice to start games continued in the first part of 2017/18. He netted a last-minute winner in a brilliant victory at Atletico Madrid in the Champions League, and his two goals against Watford in October helped turn the game on its head after his introduction off the bench with Chelsea trailing.\n" +
                    "\n" +
                    "Soon after Batshuayi had helped the club advance to the fifth round of the FA Cup with two goals in a win against Newcastle, and having found the net 19 times in 53 appearances in his first 18 months as a Chelsea player, he moved on loan to Germany’s Bundesliga to play for Borussia Dortmund until the end of the season.\n" +
                    "\n" +
                    "Before suffering an ankle injury, Batshuayi impressed in Germany, scoring seven goals in 10 leagues appearances and a further two in four Europa League fixtures.",
            "Christian Pulisic became a member of the Chelsea squad for the start of the 2019/20 season with an agreement first reached in January 2019 for his permanent transfer from Borussia Dortmund. He spent the remainder of that season on loan at the German club.\n" +
                    "\n" +
                    "He joined Chelsea on a five-and-a-half year contract and became the third American player in our history after his international team-mate, Matt Miazga, and Roy Wegerle.\n" +
                    "\n" +
                    "Agile, quick and two-footed, Pulisic is naturally a right winger but is also comfortable playing on the left or behind a striker.\n" +
                    "\n" +
                    "Pulisic made his Chelsea debut as a sub in the defeat to Manchester United, and his first start followed a few days later as we were beaten by Liverpool on penalties in the Super Cup. He set up Olivier Giroud's opener and had a goal of his own ruled out for offside. \n" +
                    "\n" +
                    "He started our next three leagues games being losing his place in the team for a while. Following the October international break, he played decisive passes in tight wins over Newcastle and Ajax having been brought off the bench. He was rewarded with a start at Burnley in our next league outing and responded in style, scoring a perfect hat-trick. Full of confidence and incisiveness, Pulisic's knack for scoring or setting up goals showed no sign of relenting, as he displayed predatory instincts to net in wins over Watford and Crystal Palace. His dribbling skills also earned us a penalty in the 4-4 epic against Ajax. \n" +
                    "\n" +
                    "Born in Hershey, Pennsylvania, he is the son of two former footballers, and spent time in England as a child, where he played with Northamptonshire side Brackley Town before moving back to the States.\n" +
                    "\n" +
                    "With a number of European clubs monitoring his progress, Pulisic signed for Dortmund as a 16-year-old in early 2015, quickly rising through the academy ranks to make his senior debut a year later.\n" +
                    "\n" +
                    "His first half-season in the Bundesliga provided nine appearances and two goals, and he became a regular under Thomas Tuchel during the 2016/17 campaign, adding more than 60 league appearances over the next two years. series of minor injuries limited Pulisic’s playing time in the 2018/19 season, but his goals included a Champions League winner at Club Brugge and one in his final home game for Dortmund that helped take their ultimately unsuccessful Bundesliga challenge into the final day.\n" +
                    "\n" +
                    "A USA international who also holds a Croatian passport, Pulisic was voted his country’s Player of the Year in 2017, and was their star player in the CONCACAF Gold Cup in the summer of 2019 shortly before he joined up with the Chelsea squad. The States reached the final where they were beaten by Mexico. Pulisic was named the Young Player of the Tournament.",
            "Tammy Abraham signed as an Under-8 and played wide-left, wide-right and as the central striker as he progressed through the age groups. He made his youth team debut as an Under-16 on the opening weekend of the 2013/14 season and netted his first Under-18 goal the following week in a 2-1 win over West Ham. He went on to make 17 appearances that season as a schoolboy, scoring five times.\n" +
                    "\n" +
                    "His impact in the 2014/15 campaign, his first year as a scholar, was significant as he bagged 32 goals in 26 appearances for the youth team. That included nine strikes in our successful defence of the FA Youth Cup crown, where he scored both home and away in the two-legged final against Manchester City.\n" +
                    "\n" +
                    "Abraham made his debut for Adi Viveash’s Under-21 side in February and got on the scoresheet again, netting a brace in a 5-3 victory. He also scored four times in the UEFA Youth League as the Blues were crowned Under-19 European champions.\n" +
                    "\n" +
                    "In 2015/16, the striker was again a clinical goalscorer as he netted eight goals in nine games, including a goal in the semi-final against Anderlecht, as our Under-19s won the European competition for a second successive season. He also bagged six in six en route to a fifth successive Youth Cup final for our youth team, and he headed his 26th goal of the season in the second leg of the final.\n" +
                    "\n" +
                    "At England Under-19 international, his prolific goalscoring was replicated on the international stage as he bagged another double in a win over Switzerland in March 2015. He signed a new contract in October 2015, committing him to the club until the end of the 2018/19 season, and his progress was rewarded with a first team debut under Guus Hiddink at Anfield in May 2016.\n" +
                    "\n" +
                    "Abraham joined Bristol City on a season-long loan on the eve of the 2016/17 campaign. He scored on his second appearance for the West Country side and kept finding the net with double figures reached by the end of September. Despite City's declining form as the season progressed, he reached 16 league goals early in 2017 and in doing so, became the highest-scoring teenager in the history of the Championship. By the end of the season he had scored 26 goals in 48 appearances for his loan club who successfully fought against relegation. He ended the campaign by picking up the Bristol City Player of the Year and Young Player of the Year awards.\n" +
                    "\n" +
                    "Abraham moved up to the England Under-21 team in October 2016 and scored twice on his debut, a 5-0 Euro qualifier win against Bosnia & Herzegovina. He was the centre-forward at the European Under-21 Championships in Poland in June 2017, earning plenty of praise for his performances as a lone striker. He scored in the semi-final against Germany but unfortunately was one of two England players who missed in the decisive penalty shoot-out.\n" +
                    "\n" +
                    "In was announced on 4 July 2017 that Abraham had signed a new five-year contract with Chelsea and would be spending the coming season on loan in the Premier League at Swansea, where his manager would be former Chelsea coach Paul Clement.\n" +
                    "\n" +
                    "Having scored five times in the first three months of the season with the Swans, Abraham made his full England debut in a friendly international against Germany at Wembley in November 2017.\n" +
                    "\n" +
                    "He finished the season with eight goals in 39 appearances in all competitions for the Swans, who were relegated to the Championship.\n" +
                    "\n" +
                    "On 31 August 2018 it was announced Abraham would be spending the forthcoming season in the Championship, at Aston Villa. He was first-choice striker for the West Midlands club throughout the 2018/19 campaign and became the first Villa player to score 20 goals since their last league-winning season of 1980/81.\n" +
                    "\n" +
                    "In total Abraham netted 26 goals in 40 appearances, the last of which was the play-off final win over Derby at Wembley which restored Villa's top-flight status. He was named in the PFA Championship Team of the Year and in the summer of 2019 played for England and the European Under-21 Championships.\n" +
                    "\n" +
                    "Abraham started the 2019/20 campaign as Frank Lampard's first-choice striker. He was close to marking his full Chelsea debut with a goal, hitting the post against Manchester United on the opening day, before winning a penalty in the Super Cup and then seeing his spot-kick saved in the shoot-out loss to Liverpool. \n" +
                    "\n" +
                    "Happier times weren't far away. It took Tammy just three minutes to put us ahead against Norwich on 24 August, and in doing so score his first goal for the club. His second, another sweet strike, came with 20 minutes to play and settled a five-goal thriller in our favour. Abraham backed up that brace with another against Sheffield United a week later - his first Stamford Bridge goals - before becoming our youngest Premier League hat-trick hero with an exquisite treble in his very next game at Wolves. Seven goals in three games took him to the top of the league's scoring charts.\n" +
                    "\n" +
                    "Abraham's form, including a first Champions League goal in Lille, earned him an England call-up in the October international break, and his involvement as a late sub in a qualifier in Prague confirmed his international status going forward. \n" +
                    "\n" +
                    "In November 2019 he became the second-youngest Chelsea player to reach 10 Premier League goals, after Arjen Robben, with a typically cool finish against Crystal Palace as the Blues recorded a sixth straight league success. "
    };


    private static int[] playerAvatar = {
            R.drawable.ava_kepa,
            R.drawable.ava_cabalero,
            R.drawable.ava_rudiger,
            R.drawable.ava_alonso,
            R.drawable.ava_cristensen,
            R.drawable.ava_azpi,
            R.drawable.ava_emerson,
            R.drawable.ava_zouma,
            R.drawable.ava_rece,
            R.drawable.ava_tomori,
            R.drawable.ava_jorginho,
            R.drawable.ava_kante,
            R.drawable.ava_barkley,
            R.drawable.ava_kova,
            R.drawable.ava_mount,
            R.drawable.ava_pedro,
            R.drawable.ava_oddoi,
            R.drawable.ava_giroud,
            R.drawable.ava_william,
            R.drawable.ava_bats,
            R.drawable.ava_pulisic,
            R.drawable.ava_tammy
    };

    private static int[] playerPhotos = {
            R.drawable.kepa,
            R.drawable.caballero,
            R.drawable.rudiger,
            R.drawable.alonso,
            R.drawable.cris,
            R.drawable.azpi,
            R.drawable.emerson,
            R.drawable.zouma,
            R.drawable.rece,
            R.drawable.tomori,
            R.drawable.jorginho,
            R.drawable.kante,
            R.drawable.rose,
            R.drawable.kova,
            R.drawable.mount,
            R.drawable.pedro,
            R.drawable.oddoi,
            R.drawable.giroud,
            R.drawable.william,
            R.drawable.bats,
            R.drawable.pulisic,
            R.drawable.tammy
    };


    static ArrayList<Player> getListData() {
        ArrayList<Player> list = new ArrayList<>();
        for (int position = 0; position < playerName.length; position++) {
            Player player = new Player();
            player.setName(playerName[position]);
            player.setShortPosition(shortPos[position]);
            player.setPosition(playerPosition[position]);
            player.setNoPemain(numberPlayer[position]);
            player.setAge(playerAge[position]);
            player.setHeight(playerHeight[position]);
            player.setWeight(playerWeight[position]);
            player.setBiography(playerBio[position]);
            player.setAvatar(playerAvatar[position]);
            player.setPhoto(playerPhotos[position]);
            list.add(player);
        }
        return list;
    }

}
