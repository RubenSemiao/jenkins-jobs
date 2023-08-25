import hudson.plugins.git.*;

def pl = new ArrayList<StringParameterValue>()
pl.add(new StringParameterValue('Afiliados', Afiliados))

def scm = new GitSCM("https://github.com/RubenSemiao/jenkins-jobs.git")
scm.branches = [new BranchSpec("*/jobs")];

def flowDefinition = new org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition(scm, "afiliados/Jenkinsfile")

def parent = Jenkins.instance
def job = new org.jenkinsci.plugins.workflow.job.WorkflowJob(parent, "Afiliados")
job.definition = flowDefinition

parent.reload()