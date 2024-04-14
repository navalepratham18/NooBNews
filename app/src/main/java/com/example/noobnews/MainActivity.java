package com.example.noobnews;
// MainActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView newsListView;
    private ArrayList<NewsItem> newsItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newsListView = findViewById(R.id.newsListView);

        // Populate news items (replace with your data)
        newsItems.add(new NewsItem(
                "Dhoni steps down as CSK captain; Ruturaj Gaikwad to lead Chennai Super Kings in IPL 2024",
                "https://crickettimes.com/wp-content/uploads/2023/04/Ruturaj-Gaikwad-CSK.jpg",
                "M.S. Dhoni has stepped down as captain of the Chennai Super Kings. Ruturaj Gaikwad will lead the team in IPL 2024. Gaikwad has been part of the franchise since 2019 and has played 52 matches. The Maharashtra batter was the Orange Cap winner in 2021, when CSK won its fourth title. Gaikwad has 1797 runs from 52 matches at an average of 39.06 and a strike rate of 135.52. \nDhoni, 42, has captained Super Kings since the IPL began in 2008 - except the two years when the franchise was suspended in the wake of the 2013 spot-fixing case - but handed over the reins to Ravindra Jadeja at the start of the 2022 season. However, Dhoni returned as skipper after eight matches. \nHe has led CSK in 212 IPL matches, won 128 and lost 82. \nDhoni led CSK to a record-equalling fifth IPL title on the third day of a T20 final against the Gujarat Titans in Ahmedabad last year. It was also CSK’s seventh title in all T20 tournaments, equal with Mumbai and Titans (South Africa), and only behind Sialkot Stallions (8). \nDhoni announced his international retirement on August 15, 2020. He led India to the 2007 World Twenty20 title, the 2011 World Cup, and the 2013 Champions Trophy."));


        newsItems.add(new NewsItem(
                "Japan’s SLIM moon lander survives another lunar night against all odds",
                "https://images.indianexpress.com/2024/01/cover_54c728.jpg?w=640",
                "The Japan Aerospace Exploration Agency (JAXA) on Thursday confirmed that its SLIM Moon lander survived two lunar nights without its instruments freezing. The Smart Lander for Investigating Moon launched in September last year and landed on the Moon on January 19. It was able to do something that ISRO’s Chandrayaan-3 could not — not once but twice.\n" +
                        "\n" +
                        "SLIM’s landing made Japan just the fifth country in the world to soft-land a spacecraft on the Moon after the United States, the Soviet Union, China and India. But it was not exactly a walk in the park — the 200 kilogram lander actually landed on its nose that day and it went dark shortly after since it was not in a great position for its solar panels to harvest sunlight. But it came back to life again on January 28, and it went on to gather science data.\n" +
                        "\n" +
                        "Shortly after that, JAXA teams put the lander in hibernation mood ahead of its first lunar winter. SLIM had already succeeded with its main mission objectives — demonstrate a soft-landing, collect science data and deploy two small rovers. And it was expected that its instruments would not survive the harsh lunar night when temperatures can be below minus hundred degrees Celsius. But it survived the lunar night not once but twice, according to a JAXA post on X, formerly Twitter.\n" +
                        "\n" +
                        "“According to the acquired data, some temperature sensors and unused battery cells are starting to malfunction, but the majority of functions that survived the first lunar night was maintained even after the second lunar night,” said a post shared by the agency on the platform."));


        newsItems.add(new NewsItem(
                "Rahul Gandhi's 'match-fixing' jibe at PM Modi; Sonia sits with Sunita Kejriwal, Kalpana Soren",
                "https://www.hindustantimes.com/ht-img/img/2024/03/31/400x225/rahul_gandhi_1711876544089_1711876548539.JPG",
                "Rahul Gandhi said Narendra Modi sent two chief ministers to jail just before the elections. “You don't want the opposition to fight election,” Rahul said.\nAs Rahul Gandhi addressed the opposition's mega rally at Capital's Ramlila Maidan on Sunday, he said Prime Minister Narendra Modi was fixing the match of the Lok Sabha election along with the help of a handful of billionaires -- even before it began and two of the players were arrested. As he spoke from the platform, Sonia Gandhi who was also present at the Opposition's show of strength sat on the dais with Sunita Kejriwal, wife of Delhi chief minister Arvind Kejriwal; and Kalpana Soren, wife of former Jharkhand chief minister Hemant Soren. Both Kejriwal and Hemant Soren have been arrested by the Enforcement Directorate. The mega rally was called to protest Kejriwal's arrest and it turned out to be a mega congregation of the INDIA bloc leaders ahead of the election.\nThis is not an election of votes but a fight to save the Constitution, the democracy, Rahul Gandhi said. \"If you don't give votes judiciously, the match-fixer will win,\" Rahul Gandhi said citing the \"freezing\" of the bank accounts of the Congress. \"Prime Minister Narendra Modi does not want the opposition to fight the election. Just before the election, he sent two chief ministers to jail. He has frozen all our accounts. Why did you do this just before the election? You could have done it after six months, before six months,\" Rahul Gandhi said.\n" +
                        "\n" +
                        "Sunita Kejriwal says 'PM Modi jailed my husband': Top quotes at INDIA rally\n" +
                        "\n" +
                        "\"One BJP leader said the Constitution will be changed once they have the majority. It was not a slip-up. It was to test the idea. Remember, the Constitution is the voice of the people. The day it is finished, the country will be finished,\" Rahul Gandhi said.\nDelhi chief minister Arvind Kejriwal was arrested by the ED on March 21 in connection with the alleged excise policy scam in the Capital. Hemant Soren was arrested on January 31 in a land scam case.\n" +
                        "\n" +
                        "Despite several disgruntlement amid the INDIA bloc partners over seat-sharing, the parties coming together to protest Kejriwal's arrest sent a message of unity. Sonia Gandhi at the stage interacted with Sunita Kejriwal and sat beside her and Kalpana Soren. A day before, Kalpana Soren met Sunita and Sonia Gandhi as she reached Delhi on Saturday."));


        newsItems.add(new NewsItem("155.8 kmph! Who is Mayank Yadav, the fastest bowler of IPL 2024?",
                "https://indianexpress.com/wp-content/uploads/2024/03/MAYANK-YADAV-CROP.jpg?resize=1536,864",
                "NEW DELHI: Lucknow Super Giants clinched their maiden victor ..\n" +
                "\n" +
                "Jonny Bairstow, a wrecker of pace bowling all around the world, was in for a shock on Saturday night when he shaped to pull a back-of-length delivery from the debutant Mayank Yadav as it rushed at him in a blur. \nIt resulted in a dolly of a catch and the subsequent wickets with bouncers in a sensational spell of 3/27, that included one at 155.8 kmph, against Punjab Kings warmed the hearts of Mayank’s father Prabhu Yadav. \nIt took him back to a pivotal moment when Mayank was 14 and when he, a fan of the West Indian pace legend Curtly Ambrose, planted a seed in his son.Yadav sr. was returning from his factory, where they make sirens for ambulances and police vehicles, when he stopped at Sonnet Club at the Venkateshwara college in Delhi to watch Mayank bowl. On their way back home, the father would drop a nugget that would years later have repercussions in an IPL game at Lucknow’s Akana ground.“I shared with him a story of Ambrose. Tujhe pata hai usse log darte kyu tey? kyunki wo sar pe daalta tha, tujhe darana hai batsmen ko toh wahi karna hoga (You know why he was feared because he used to hit them on their heads. If you want to put that fear in their minds you must start doing the same),” \nPrabhu rewinds to that little big moment to The Indian Express. Over his teenage years, Mayank became the most fearsome pacer in Delhi and is named as “sar pe maarne wala bowler( Who hits on the head).” On Saturday, even as he was harassing the batsmen, the former pacer Brett Lee would tweet: “India has found its fastest bowler. Raw pace. Very impressive.”Mayank Yadav of the Lucknow Super GiantsMayank Yadav of the Lucknow Super Giants bowled the fastest ball of the IPL 2024. (PHOTO: LSG via X)“General life mey bhi mujhe speed pasand hai (I am fascinated with speed in life in general). I love rockets, jets and superbikes. Speed gives me a thrill,” Mayank would say at the end of the game."));


        newsItems.add(new NewsItem(
                "Bihar Board 10th Result 2024 Date: BSEB Matric result to be declared on March 31 at 1.30 pm",
                "https://www.hindustantimes.com/ht-img/img/2024/03/29/400x225/WhatsApp_Image_2024-02-21_at_54820_PM_1711705946021_1711705946216.jpeg",
                "The result will be hosted on the HT Portal as well. As seen during Class 12th results, the official website could become slow or even crash after the result announcement, as lakhs of students will be visiting it to download their scorecards. If the official website does not work on the result day, students can use the HT Portal to check their results quickly.\n" +
                "\n" +
                "Bihar board 10th result 2024 on the HT portal\n" +
                "There is also an option to pre-register for the Bihar board Matric result on the HT Portal. By registering in advance, you will get an alert as soon as the result is hosted.\n" +
                "\n" +
                "How to check BSEB Bihar board 10th result 2024\n" +
                "Go to biharbardonline.bihar.gov.in.\n" +
                "\n" +
                "Open the Class 10th result link given on the home page.Enter your roll code and roll number.Check and download the Bihar board 10th result.Bihar board 10th result 2024 on HT Portal.The Bihar Board 10th examination was conducted from February 15 to February 23, 2024.Last time, the Matric result was announced on March 31, in which the overall pass percentage was 81.04 per cent. A total of 16,10,657 students appeared in the examination, of whom 13,05,203 passed.Md Rumman Ashraf was the state topper of the matric exam with 97.8 per cent or 489 out of 500 marks.Get latest news onEducation along with updates on Board Exams and Competitive Exams at Hindustan Times. Also get latest Job updates on Employment News."));


        newsItems.add(new NewsItem(
                "The Great Indian Kapil Show first impression: Even Ranbir Kapoor and Gutthi’s reunion couldn’t mask Kapil Sharma’s stale humour",
                "https://images.indianexpress.com/2024/03/ranbir_141ad6.jpg?w=640",
                "Tu-dum! With Netflix’s signature melody on his lips, Ranbir Kapoor bent himself into an N to leave the The Great Indian Kapil Show audience in splits. Not a bad way for Kapil Sharma, one of India’s favourite comedians, to kick off a new innings.\n" +
                "\n" +
                "The premiere episode of The Great Indian Kapil Show witnessed Ranbir, accompanied by his mother Neetu Kapoor and sister Riddhima Kapoor, inaugurate Kapil’s new extravagant set dubbed as Kap’s Cafe. The cafe is situated within an airport backdrop, perhaps a nod to the show’s global reach as it streams in 192 countries, a fact that Kapil doesn’t let you forget during the first episode. But while Kapil might be flying high on his latest achievement, he is serving the same old bland reheated airport food in a flashy container.\n" +
                "\n" +
                "The format of the show remains unchanged – Kapil Sharma playfully ribbing his guests, posing ‘gharelu’ questions to Bollywood stars, while his ensemble cast dons various characters to break the monotony of his tired jokes. In one segment Kiku Sharda, in the guise of Chef Dhaniya Lal, served a glass of water as his signature dish. One can’t help but compare it with the lack of innovation within the show itself.\n" +
                "\n" +
                "While it’s understandable that the makers want to lure the young audience and the choice to stream on an OTT platform is part of the plan, the pursuit of relatability seems to overshadow the humour. Unlike the previous shows of the comedian, the writing here felt too self-aware, prioritising market appeal over genuine comic creativity.\n" +
                "\n" +
                "Even the comedic sketches, once the hallmark of Kapil’s team, now feel reverse-engineered to cater to contemporary tastes. For instance, Kiku assumes the persona of Sunny Deol from last year’s hit film Gadar 2 and he tries to protect Krushna Abhishek, who channels Bobby Deol’s Abrar, from Ranbir’s Animal gang. While their brief comic skit managed to make me smile, the sound of laughter remained unheard, even to my own ears."));


        newsItems.add(new NewsItem(
                "‘Eye opening’: PM Modi lashes out at Congress for giving away Katchatheevu island to Sri Lanka",
                "https://www.livemint.com/lm-img/img/2024/03/31/600x338/narendra_modi_1711863720910_1711863721122.jpg",
                "Prime Minister Narendra Modi on Sunday lashed out at the Congress party over a controversial island, Katchatheevu that was given to Sri Lanka by former Indian Prime Minister Indira Gandhi in 1974. The Katchatheevu island debate has taken centre stage in Tamil Nadu politics as the Lok Sabha election nears.\n" +
                        "\n" +
                        "'PM Modi aims to transcend divisive politics of caste, religion': FM Sitharaman\n" +
                        "\n" +
                        "PM Modi on Sunday cited a report in Times of India that said, 'RTI reply shows how Indira Gandhi ceded the island to Sri Lanka'. The PM on the X platfrom wrote, \"Eye-opening and startling! New facts reveal how Congress callously gave away Katchatheevu\".\n" +
                        "\n" +
                        "PM Narendra Modi added, \"Weakening India’s unity, integrity, and interests has been Congress’ way of working for 75 years and counting\".\nRTI reply on Katchatheevu island\n" +
                        "According to the document obtained by Tamil Nadu's Bharatiya Janata Party (BJP) chief K Annamalai via an RTI application, the Indira Gandhi government in 1974 handed over the Katchatheevu island, located in Palk Strait to Sri Lanka.\n" +
                        "\n" +
                        "The report also cited the statement of India's first Prime Minister Jawaharlal Nehru on the issue."));


        newsItems.add(new NewsItem(
                "Expecting Refund Of ₹ 6,329 Crore From Income Tax Department, Says Infosys",
                "https://static.toiimg.com/thumb/msid-104996486,imgsize-27962,width-400,resizemode-4/104996486.jpg",
                "New Delhi : Infosys expects a refund of ₹ 6,329 crore from the Income Tax Department, the country's second largest IT services company said. It also informed the stock exchanges about tax demand to the tune of ₹ 2,763 crore, citing various assessment orders.\n" +
                        "\n" +
                        "Infosys Ltd said it has received orders from the Income Tax Department for assessment years 07-08 to 15-16, 17-18, and 18-19 during the quarter.\n" +
                        "\n" +
                        "\"As per the orders, the company expects a refund of ₹ 6,329 crore (including interest). The company is in the process of evaluating the implications of these orders on the financial statements for the quarter and year ending March 31, 2024,\" Infosys said in a BSE filing.\n" +
                        "\n" +
                        "Infosys, which competes with TCS and Wipro and others in the market for IT services contracts, is scheduled to declare its financial results for the fourth quarter of the current fiscal year as well as the full FY24 on April 18.\n" +
                        "\n" +
                        "The Bengaluru-headquartered IT company also said it has received an order for assessment year 22-23 with a tax demand of ₹ 2,763 crore, including interest, and for assessment year 11-12 with a tax demand of ₹ 4 crore, interest included.\n" +
                        "\n" +
                        "Infosys has received assessment orders for subsidiaries as well, totalling ₹ 277 crore.\n" +
                        "\n" +
                        "These include assessment orders for assessment years 21-22 and 18-19, respectively, with total tax demand of ₹ 145 crore; order for assessment year 22-23 with a tax demand of ₹ 127 crore; and for assessment year 22-23 entailing tax demand of ₹ 5 crore -- all of them inclusive of interest.\n" +
                        "\n" +
                        "\"The company is in the process of evaluating the implications of these orders on the financial statements for the quarter and year ending March 31, 2024 and also evaluating filing appeals against these orders,\" Infosys said.\n" +
                        "\n" +
                        "Further, a subsidiary of the company has received refund orders under Section 254 for assessment years 07-08 and 08-09 and under Section 154 for assessment year 16-17, it said, adding that the refund amount as per these orders is ₹ 14 crore."));


        newsItems.add(new NewsItem(
                "Opinion | For India's Drone Challenges, Lessons From The Agni-V Feat",
                "https://c.ndtvimg.com/2021-06/09t1v5m8_agni-prime-test-fired_625x300_28_June_21.jpg?im=FaceCrop,algorithm=dnn,width=1200,height=738",
                "India's Agni-5 stands as one of the most advanced nuclear-capable missiles, measuring 17.5 metres in length, weighing 50 tonnes, carrying a one-ton payload, and boasting a range exceeding 5,000 kilometres.\n" +
                        "\n" +
                        "The term Agni means fire, and the test mission was dubbed 'Divyastra', meaning divine weapon. The test aims to bolster India's nuclear deterrence capability by exemplifying the MIRV (multiple independently targetable re-entry vehicle) technology, which entails launching multiple warheads from a single missile to target multiple destinations.\n" +
                        "\n" +
                        "This missile can be configured with a combination of warheads and decoys, potentially confusing adversaries and diminishing the effectiveness of Anti-Ballistic Missile (ABM) missions. Such capability is designed to overwhelm the adversary's ABM systems.\n" +
                        "\n" +
                        "India has no expansionist aspirations and has never initiated aggression against any country. Nonetheless, it has faced numerous aggressions since gaining independence. The MIRV capability would bolster the assurance level of India's deterrence posture in alignment with its no-first-use policy. It marks a significant milestone in India's indigenous missile development programme, crucial for addressing security concerns arising from hostile Chinese activities along the border, Pakistan's backing of terrorism in India, growing military collaboration between China and Pakistan, and the militarisation of the Tibet Autonomous Region.\n"+
                        "\n"+
                        "Lessons for India's UAV Programme\n" +
                        "\nIndia's missile and UAV (unmanned aerial vehicle) development programmes share a common thread as both have been overseen by DRDO. Yet, their outcomes differ significantly. While the Agni programme successfully developed complex and denied technologies, yielding a series of indigenous Agni missiles, navigation systems, payloads, and critical subsystems, the progress of India's UAVs has been less successful thus far. In the tactical and Medium Altitude Long Endurance (MALE) UAV segment, projects such as Nishant, Panchi, Rustom-I, and Tapas have been undertaken.\n" +
                        "\n" +
                        "However, challenges such as vulnerability to satellite detection led to the abandoning of projects like Nishant, while others like Panchi faced discontinuation due to a lack of further orders. Despite having been built from a successful manned aircraft, the future of Short-Range Unmanned Aerial Vehicles (SRUAV) remains uncertain.\n" +
                        "\n" +
                        "The Tapas Medium Altitude Long Endurance (MALE) UAV development project was sanctioned in 2011, with its maiden flight occurring in November 2016. DRDO laboratories played a pivotal role in developing numerous critical systems and sub-systems for Tapas, including the autopilot, communication systems, Automatic Takeoff and Landing (ATOL), Ground Control System (GCS), Synthetic Aperture Radar (SAR), Medium Range Electro Optic (MREO), and Indigenous Geo Augmented Navigation (GAGAN), among others.\n" +
                        "\n" +
                        "Many of these systems underwent testing on the Rustom-1 platform before being integrated into Tapas, a significant achievement considering India's historical dependence on imports for critical systems.\n" +
                        "\n" +
                        "DRDO has encountered challenges in developing tactical or MALE UAVs over the past three-and-a-half decades. Despite developing several crucial enabling technologies, India awaits the operationalisation and induction of indigenous UAVs. While the success of the Agni missile programme showcases the potential and capabilities of DRDO scientists, the not-so-remarkable journey in UAV development programmes necessitates introspection. The reasons behind failures in these UAV programmes must be thoroughly examined, and solutions identified.\n" +
                        "\n" +
                        "An examination is needed to determine whether the approach to handling failures in the Agni missile programme differs from that in indigenous UAV projects. Was the spiral development approach, successful in the missile program, adopted in UAV development? Was the synergy among stakeholders in the missile programme different from UAV programmes? Were the approaches of DRDO teams or decision-makers different in missile programmes?\n" +
                        "\n" +
                        "While the gaps and challenges of UAV programmes may differ from those of the Agni missile programme, they are surmountable and must be addressed. India's UAV programme stands at a crucial juncture, equipped with enabling technologies that can lead to success. It is passing through the Marut moment; the famous indigenous fighter development program of the early 1960s that could not be retrieved due to lack of perseverance and other challenges. Thorough analysis and suitable course corrections are necessary to realign the program.\n" +
                        "\n" +
                        "The DRDO's capabilities, demonstrated in the missile programme, must be replicated in the UAV projects. UAVs, like missiles, are pivotal to the future of aerial warfare and must be prioritised to meet India's security needs. The missile programme offers several lessons in that direction."));


        newsItems.add(new NewsItem(
                "\"Want Arvind Kejriwal's Phone To...\": Atishi's Big Charge Against Probe Agency",
                "https://c.ndtvimg.com/2023-11/3qlngjpo_arvind-kejriwal-1200_625x300_08_November_23.jpeg",
                "New Delhi : The Enforcement Directorate is working as BJP's political weapon and it wants to get details of AAP's Lok Sabha election strategy by accessing Delhi Chief Minister Arvind Kejriwal's phone, senior AAP leader Atishi alleged on Friday.\n" +
                        "Mr Kejriwal, who is the national convener of the Aam Aadmi Party (AAP), was arrested by the central probe agency on March 21 in the Delhi excise policy-linked money laundering case and is in its custody till April 1. The insistence of the Enforcement Directorate (ED) to look into Arvind Kejriwal's mobile-phone, which is a few months old and did not exist when the policy was formed and implemented, proves that the agency is working as a \"political weapon\" of the BJP, Atishi alleged at a press conference in Delhi.\n" +
                        "\n" +
                        "The AAP leader, who is a minister in the Delhi government, said that \"actually it is the BJP and not the ED that wants to know what is there on Kejriwal's phone\".\n" +
                        "\n" +
                        "The excise policy was implemented in 2021-22 and the chief minister's current phone is just a few months old, she claimed.\n" +
                        "\n" +
                        "The ED has said that Mr Kejriwal's phone of that period is not available, and now, it wants the password of his new phone, Atishi said.\n" +
                        "\n" +
                        "\"They want it because they will find in it details of AAP's Lok Sabha poll strategy, campaign plans, talks with INDIA bloc leaders and information regarding media and social media strategy,\" she said.\n" +
                        "\n" +
                        "The bloc has been formed by some opposition parties, including the AAP, the TMC, the Congress, the DMK and the SP, to counter the BJP in the parliamentary polls."));


        newsItems.add(new NewsItem(
                "OpenAI Previews 'Voice Engine' Audio Tool That Can Clone Human Voices With 15 Seconds of Audio",
                "https://i.gadgets360cdn.com/large/chatgpt_openai_reuters_1675831938432.jpg?downsize=950:*",
                "OpenAI is sharing early results from a test for a feature that can read words aloud in a convincing human voice — highlighting a new frontier for artificial intelligence and raising the specter of deepfake risks. The company is sharing early demos and use cases from a small-scale preview of the text-to-speech model, called Voice Engine, which it has shared with about 10 developers so far, a spokesperson said. OpenAI decided against a wider rollout of the feature, which it briefed reporters on earlier this month.\n" +
                        "\n" +
                        "A spokesperson for OpenAI said the company decided to scale back the release after receiving feedback from stakeholders such as policymakers, industry experts, educators and creatives. The company had initially planned to release the tool to as many as 100 developers through an application process, according to the earlier press briefing.\n" +
                        "\n" +
                        "“We recognize that generating speech that resembles people's voices has serious risks, which are especially top of mind in an election year,” the company wrote in a blog post Friday. “We are engaging with US and international partners from across government, media, entertainment, education, civil society and beyond to ensure we are incorporating their feedback as we build.”\nOther AI technology has already been used to fake voices in some contexts. In January, a bogus but realistic-sounding phone call purporting to be from President Joe Biden encouraged people in New Hampshire not to vote in the primaries — an event that stoked AI fears ahead of critical global elections.\n" +
                        "\n" +
                        "Unlike OpenAI's previous efforts at generating audio content, Voice Engine can create speech that sounds like individual people, complete with their specific cadence and intonations. All the software needs is 15 seconds of recorded audio of a person speaking to recreate their voice.\n" +
                        "\n" +
                        "During a demonstration of the tool, Bloomberg listened to a clip of OpenAI Chief Executive Officer Sam Altman briefly explaining the technology in a voice that sounded indistinguishable from his actual speech, but was entirely AI-generated.\nIn the testing program, OpenAI is requiring its partners to agree to its usage policies, obtain consent from the original speaker before using their voice, and to disclose to listeners that the voices they're hearing are AI-generated. The company is also installing an inaudible audio watermark to allow it to distinguish whether a piece of audio was created by its tool.\n" +
                        "\n" +
                        "Before deciding whether to release the feature more broadly, OpenAI said it's soliciting feedback from outside experts. “It's important that people around the world understand where this technology is headed, whether we ultimately deploy it widely ourselves or not,” the company said in the blog post.\n" +
                        "\n" +
                        "OpenAI also wrote that it hopes the preview of its software “motivates the need to bolster societal resilience” against the challenges brought about by more advanced AI technologies. For example, the company called on banks to phase out voice authentication as a security measure for accessing bank accounts and sensitive information. It's also seeking public education about deceptive AI content and more development of techniques for detecting whether audio content is real or AI-generated."));


        newsItems.add(new NewsItem(
                "Deserves \"Oscar\": Sunil Gavaskar's Mega Comment On Viral Virat Kohli-Gautam Gambhir Hug In IPL Game",
                "https://c.ndtvimg.com/2024-03/gvrgthqg_kohli-gambhir-hug_625x300_29_March_24.jpg?output-quality=80&downsize=639:*",
                "Cricket rivalry aside, the Royal Challengers Bengaluru vs Kolkata Knight Riders IPL 2024 game in Bengaluru was witness to a very special moment. In the buildup to the match, two men grabbed the headlines - Virat Kohli and Gautam Gambhir. During the IPL 2023, Gambhir, then a mentor of Lucknow Super Giants, was involved in a heated argument with RCB's Virat Kohli after the latter altercation with Naveen ul Haq. The image of the two star cricketers' argument went viral.\n" +
                        "\n" +
                        "On Friday, Virat Kohli and Gautam Gambhir hugged it out on field. Gautam Gambhir approached Virat Kohli and shook his hand. They them hugged. The image of the two hugging went viral.\n" +
                        "\n" +
                        "\"Fairplay award to KKR for this hug between Virat Kohli and Gautam Gambhir,\" Ravi Shastri said on the incident.\n" +
                        "\n" +
                        "\"Not only a fairplay award, but also an Oscar award,\" Sunil Gavaskar said.\n" +
                        "\n" +
                        "Talking about the game, Star batter Virat Kohli's skilful unbeaten fifty formed the foundation of Royal Challengers Bengaluru's competitive 182 for six against Kolkata Knight Riders in their IPL match in Bengaluru on Friday. Kohli (83, 59b, 4x4, 4x6) and Cameron Green (33 off 21b) milked 65 runs off 42 balls for the second wicket, the primary alliance in RCB innings, as the home side produced a two-faced effort after being asked to bat first on a track that was on the slower side.\n" +
                        "\n" +
                        "An archetypal Dinesh Karthik cameo (20, 8b, 3x6) added gravitas to the RCB total as usual towards the end.\n" +
                        "\n" +
                        "Skipper Faf du Plessis went back early as the Royal Challengers captain's attempt to scoop pacer Harshit Rana ended in the hands of Mitchell Starc inside the circle.\n" +
                        "\n" +
                        "But a period of stability followed as Kohli and Green kept RCB on the track with a busy stand that saw them reaching 61 for 1 in the Power Play segment.\n" +
                        "\n" +
                        "Kohli dished out drives and lofts over covers, a new addition to his batting, sweeps and slog-sweep to fetch his runs, but the shot of the night was a swat-flick off Starc that sailed for a six.\n" +
                        "\n" +
                        "In fact, no other shot really encapsulates Kohli's batting like the swat-flick – a child of his desire to find newer ways to sustain the domination of bowlers.\n" +
                        "\n" +
                        "A simple snap of wrists and power emanating from a strong bottom hand can turn this traditionally gentle shot into a malevolent run-making option.\n" +
                        "\n" +
                        "Kohli brought his fifty in 36 balls whereas other batters, except Green, generally struggled for momentum and timing.\n" +
                        "\n" +
                        "But at the other end, Green wasn't really bothered about such technical angles, as his batting was all about brute power.\n" +
                        "\n" +
                        "Sunil Narine, who was playing his 500th T20 match, was given a hammering as Green took 15 runs off the spinner's first over that included a sequence of 4, 4, 6 – a sweep, slap past cover and a hoick over long-on.\n" +
                        "\n" +
                        "However, the burgeoning alliance was snapped when Green's effort to play a pull off Andre Russell was the ball crashing on to his stumps as the ball kept a tad low.\n" +
                        "\n" +
                        "Glenn Maxwell, who was dropped twice on 11 and 21, en route a 19-ball 28 could not exploit the largesse of KKR fielders as his luck finally ran out against Narine.\n" +
                        "\n" +
                        "A slash off the West Indian spinner ended in the hands of Rinku Singh at deep point, and Maxwell had to depart after adding 42 runs for the third wicket with Kohli.\n" +
                        "\n" +
                        "Rajat Patidar (3, 4b) seemed to be suffering from lack of confidence after his travails in the Test series against England, and the right-hander produced another vastly underwhelming knock.\n" +
                        "\n" +
                        "Listen to the latest songs, only on JioSaavn.com\n" +
                        "\n" +
                        "But at one end, Kohli kept going even as the KKR bowlers adopted the pace-off strategy with excellent effect to slow down the proceedings."));



        // Create custom adapter
        NewsListAdapter adapter = new NewsListAdapter(this, newsItems);
        newsListView.setAdapter(adapter);

        // Set item click listener
        newsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Create an intent to open NewsDetailActivity
                Intent intent = new Intent(MainActivity.this, NewsDetailActivity.class);
                // Pass the selected news item to NewsDetailActivity
                intent.putExtra("newsItem", newsItems.get(position));
                // Start NewsDetailActivity
                startActivity(intent);
            }
        });
    }
}
