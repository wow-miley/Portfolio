package codes.miley.model

data class BlogPost(
    val id: String,
    val title: String,
    val subtitle: String,
    val date: String,
    val publishedDate: String,
    val excerpt: String,
    val content: String,
)

val DARK_FACTORY = BlogPost(
    id = "dark-factory-needs-windows",
    title = "The Dark Factory Needs Windows",
    subtitle = "Building trust in AI autonomy through transparent cognition",
    date = "February 12, 2026",
    publishedDate = "2026-02-12",
    excerpt = "AI is raising the level of abstraction in software development. But the verification layer keeps pulling humans back down. But what if cognition itself was transparent the whole time?",
    content = """
There's a factory in Japan where robots are building other robots in the dark. No lights, no people — just machines making other machines. This metaphor of a self-replicating software factory is now being discussed in the context of the potential end-game for agentic AI, but we need to be focusing our discussion on why humans weren't just completely replaced in this operation; instead, they are now able to better *leverage* their expertise. Engineers who once stood on the assembly line could now operate at a higher level, and could instead invest all of their time in optimizing the systems that design the robots.

Dan Shapiro has described [five levels of AI-assisted programming](https://www.danshapiro.com/blog/2026/01/the-five-levels-from-spicy-autocomplete-to-the-software-factory/), which predicts this same trajectory will happen for software engineering. At Level 0, you're typing every character into a code editor. But at Level 5, the "Dark Software Factory", your role can shift to purely defining the intent for what you want the software to do. And today, we're much closer to Level 5 than most people realize.

This fully autonomous future is no longer hypothetical. [StrongDM's AI team](https://factory.strongdm.ai/) now has agents writing and testing code without any human involvement. [Stripe's Minions](https://stripe.dev/blog/minions-stripes-one-shot-end-to-end-coding-agents) are producing over a thousand code changes per week, and all are authored entirely by AI. [Simon Willison's latest tools](https://simonwillison.net/2026/Feb/10/showboat-and-rodney/) allow agents to demonstrate what they've built, allowing humans to evaluate outcomes instead of the source code. All of these tools are betting on the same future— AI allowing for [unprecedented leverage](https://tynan.com/bye2025/) of our human intelligence. And all three have run into the same limitation.

Trusting the output from layers beneath you is trickier than if you were building that output directly. Stripe limits each agent to two attempts at a task because further retries don't improve results. StrongDM's agents were able to find shortcuts that could pass quality checks without doing real work. Willison noticed agents were tampering with their own demo outputs to meet the requirements. The smarter the agent, the more creative the workaround for "reward hacking".

Each team has solved this by adding layers of external verification — test suites, human review on every change, audit logs, monitoring dashboards. All of these methods are just reconstructing what the agent did after the fact. It works — but it means you need to step back down a level of abstraction to validate a large pile of work that you were just freed from doing. Instead of the engineer writing the code, they now spend their time checking a thousand AI-written changes weekly. The promise of maximizing our leverage keeps getting pulled back by the need to verify implementation details.

## Windows, not mirrors

There's a different approach — I've been working on building it for the past three years.

![Demo](/blog/dark-factory-needs-windows/demo.gif)

Instead of verifying an opaque AI process from outside, what if the cognition itself was transparent in the first place? In [AMPERE](https://github.com/socket-link/ampere), every phase of agent reasoning — perception, recall, optimization, planning, execution, and coordination — emits structured events as a natural consequence of its design. Not just logs being added after the fact, but thinking that you can observe as it forms.

A trace only tells you that an agent called `writeFile()`. A cognitive event tells you it perceived a requirement, recalled a similar implementation, considered two approaches, estimated low confidence in one, and chose the other — all *before* writing to the file.

When confidence in a decision is low, it surfaces as a structured signal. The agent communicates uncertainty in terms that a human can evaluate, then incorporates the human's judgment before continuing. Uncertainty is no longer a failure mode, but a collaboration point where each party can operate at the abstraction level they're best at.

The human stays elevated in the level of their work. All failed attempts become diagnosable, and agents learn how to avoid those failures in the future. Unexpected behavior is immediately legible — not as a post-mortem, but in real time.

## The lights are for us

The Dark Factory doesn't need to stay dark. Not because the darkness is dangerous, but because humans who operate it still need to see what's being built — not every bolt, but the reasoning that determined which bolt goes where, and any moment when the system wasn't sure about its decision.

The lights aren't for the robots. They're for us.
""".trimIndent(),
)

val ALL_POSTS = listOf(
    DARK_FACTORY,
)
