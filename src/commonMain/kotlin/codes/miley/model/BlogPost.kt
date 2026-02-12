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
There's a factory in Japan where robots build other robots in the dark. No lights, no people — just machines making machines. It became shorthand for full automation, but the interesting thing about the dark factory isn't that humans were removed. It's that they were *leveraged*. Engineers who once stood on the assembly line now design the systems that design the robots.

Dan Shapiro's [five levels of AI-assisted programming](https://www.danshapiro.com/blog/2026/01/the-five-levels-from-spicy-autocomplete-to-the-software-factory/) describe this same trajectory for software. At Level 0, you type every character. At Level 5 — the Dark Software Factory — your role is pure intent. And we're closer to Level 5 than most people realize.

This isn't hypothetical. [StrongDM's AI team](https://factory.strongdm.ai/) has agents writing and testing code without human involvement. [Stripe's Minions](https://stripe.dev/blog/minions-stripes-one-shot-end-to-end-coding-agents) produce over a thousand code changes per week, all authored entirely by AI. [Simon Willison's latest tools](https://simonwillison.net/2026/Feb/10/showboat-and-rodney/) let agents demonstrate what they've built so humans evaluate outcomes, not implementation details. All three are betting on the same thing — AI as [unprecedented leverage](https://tynan.com/bye2025/) for human intelligence. And all three ran into the same wall.

Trusting the layers beneath you is harder than building them. Stripe limits each agent to two attempts at a task because further retries don't improve results. StrongDM's agents found shortcuts that passed quality checks without doing real work. Willison noticed agents tampering with their own demo outputs. The smarter the agent, the more creative the workaround.

Each team solved this by adding layers of external verification — test suites, human review on every change, audit logs, monitoring dashboards. All reconstructing what the agent did after the fact. It works — but it means stepping back down a level of abstraction to check the work you were just freed from doing. The engineer freed from writing code now spends their time checking a thousand changes weekly. The promise of leverage keeps getting pulled back toward the details.

## Windows, not dashboards

There's a different approach — and as an engineer, I've been building it for three years.

Instead of verifying an opaque process from outside, what if cognition itself was transparent? In [AMPERE](https://github.com/socket-link/ampere), every phase of agent reasoning — perception, recall, planning, execution, coordination — emits structured events as a natural consequence of its design. Not logs added after the fact. Thinking you can observe as it forms.

A trace tells you an agent called `writeFile()`. A cognitive event tells you it perceived a requirement, recalled a similar implementation, considered two approaches, estimated low confidence in one, and chose the other — all *before* the write.

When confidence drops, it surfaces as a structured signal. The agent communicates uncertainty in terms a human can evaluate, then incorporates their judgment. Not a failure mode — a collaboration point where each party operates at the abstraction level they're best at.

The human stays elevated. Shortcuts become visible as the thought forms. Failed attempts become diagnosable. Unexpected behavior becomes immediately legible — not after a post-mortem, but in real time.

## The lights are for us

The Dark Factory doesn't need to stay dark. Not because darkness is dangerous, but because the humans who designed it still need to see — not every bolt, but the reasoning that chose which bolt goes where, and the moment when the system isn't sure.

The lights aren't for the robots. They're for us.
""".trimIndent(),
)

val ALL_POSTS = listOf(
    DARK_FACTORY,
)
